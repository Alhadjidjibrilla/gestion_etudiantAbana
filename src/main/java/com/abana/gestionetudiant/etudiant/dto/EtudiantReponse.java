package com.abana.gestionetudiant.etudiant.dto;

import com.abana.gestionetudiant.commun.GenreSexe;

public record EtudiantReponse(
        Long id,
        String nomComplet,
        String matricule,
        String mail,
        GenreSexe sexe
) {
}
