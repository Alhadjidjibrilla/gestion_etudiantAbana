package com.abana.gestionetudiant.etudiant;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Primary
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository repository;

    @Override
    public Etudiant getEtudiantById(Long id) {
        return null;
    }

    @Override
    public Etudiant create(Etudiant newEtudiant) {
        // newEtudiant on enregistre
        // Methode A
        return null;
    }
}
