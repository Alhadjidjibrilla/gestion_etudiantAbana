package com.abana.gestionetudiant.etudiant.dto;

import com.abana.gestionetudiant.etudiant.GenreSexe;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record EtudiantRequete(

        @NotBlank(message = "Votre nom est obligatoire")
        @Size(min = 4, message = "Votre nom doit etre sur 04 caracteres au moins")
        String nom,

        @Email(
                regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
                message = "Votre mail est invalide")
        String mail,

        GenreSexe sexe,
        String matricule,
        String telephone,
        LocalDate date_naissance,
        String lieu_naissance
) {

}
