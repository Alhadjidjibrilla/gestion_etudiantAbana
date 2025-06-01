package com.abana.gestionetudiant.etudiant.dto;

import com.abana.gestionetudiant.etudiant.GenreSexe;

public record EtudiantReponse(
        String nomComplet,
        String matricule,
        GenreSexe sexe
) {
}
