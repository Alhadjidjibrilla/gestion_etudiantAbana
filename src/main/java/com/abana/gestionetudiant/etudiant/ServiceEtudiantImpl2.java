package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;
import org.springframework.stereotype.Service;

@Service
public class ServiceEtudiantImpl2 implements EtudiantService{
    @Override
    public EtudiantReponse getEtudiantById(Long id) {
        return null;
    }

    @Override
    public EtudiantReponse create(Etudiant newEtudiant) {
        // Methode B
        return null;
    }
}
