package com.abana.gestionetudiant.etudiant;

public interface EtudiantService {
    Etudiant getEtudiantById(Long id);
    Etudiant create(Etudiant newEtudiant);
}
