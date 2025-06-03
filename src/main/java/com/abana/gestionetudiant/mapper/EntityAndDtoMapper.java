package com.abana.gestionetudiant.mapper;

import com.abana.gestionetudiant.etudiant.Etudiant;
import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;
import org.springframework.stereotype.Service;

@Service
public class EntityAndDtoMapper {

    public EtudiantReponse getEtudiantReponse(Etudiant etudiantSauvegarder) {
        return new EtudiantReponse(
                etudiantSauvegarder.getId(),
                etudiantSauvegarder.getNom() + " " + etudiantSauvegarder.getPrenom(),
                etudiantSauvegarder.getMatricule(),
                etudiantSauvegarder.getMail(),
                etudiantSauvegarder.getSexe());
    }

}
