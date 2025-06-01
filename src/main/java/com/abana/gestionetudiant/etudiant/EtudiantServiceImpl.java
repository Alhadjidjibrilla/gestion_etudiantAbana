package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Primary
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository repository;

    @Override
    public EtudiantReponse getEtudiantById(Long id) {
        return null;
    }

    @Override
    public EtudiantReponse create(Etudiant newEtudiant) {
        // newEtudiant on enregistre
        // Methode A
        return null;
    }
}
