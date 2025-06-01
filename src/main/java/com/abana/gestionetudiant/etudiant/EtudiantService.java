package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;

public interface EtudiantService {
    EtudiantReponse getEtudiantById(Long id);
    EtudiantReponse create(Etudiant newEtudiant);
}
