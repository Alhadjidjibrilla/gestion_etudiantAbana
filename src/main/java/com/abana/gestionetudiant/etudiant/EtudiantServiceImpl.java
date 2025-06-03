package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;
import com.abana.gestionetudiant.etudiant.dto.EtudiantRequete;
import com.abana.gestionetudiant.exceptions.MailDejaUtiliserException;
import com.abana.gestionetudiant.mapper.EntityAndDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Primary
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository repository;
    private final EntityAndDtoMapper mapper;

    @Override
    public EtudiantReponse create(final EtudiantRequete requete) {
        // 1 - Verifier que le mail n'est pas encore utilisé
        Optional<Etudiant> optionalEtudiant = this.repository.findByMailIgnoreCase(requete.mail().trim());
        // CAS OU L'ETUDIANT EXISTE - ON DECLANCHE UNE EXCEPTION ET FIN D'EXECUTION
        if (optionalEtudiant.isPresent()) {
            throw new MailDejaUtiliserException("Le mail '" + requete.mail() + "' est deja utiliser par un autre étudiant");
        }
        // CAS OU L'ETUDIANT N'EXISTE PAS
        // 2 - Formatter la requete pour correspondre aux attentes du repository
        final var etudiant = Etudiant.builder()
                .nom(requete.nom())
                .prenom(requete.prenom())
                .matricule("")
                .mail(requete.mail())
                .sexe(requete.sexe())
                .telephone(requete.telephone())
                .date_naissance(requete.date_naissance())
                .lieu_naissance(requete.lieu_naissance())
                .build();

        // 3 - Sauvegarder l'étudiant
        final var etudiantSauvegarder = this.repository.save(etudiant);

        // 4 - Retourner la reponse (re-formater dans le style EtudiantReponse)

        return this.mapper.getEtudiantReponse(etudiantSauvegarder);
    }

    @Override
    public List<EtudiantReponse> tousLesEtudiants() {
        /*
        final var etudiants = this.repository.findAll();

        final var etudiantReponseList = new ArrayList<EtudiantReponse>();

        for (Etudiant etudiant : etudiants) {
            final var rep = this.mapper.getEtudiantReponse(etudiant);
            etudiantReponseList.add(rep);
        }

        return etudiantReponseList;
         */

        return this.repository.findAll().stream()
                .map(this.mapper::getEtudiantReponse)
                .toList();

    }


}
