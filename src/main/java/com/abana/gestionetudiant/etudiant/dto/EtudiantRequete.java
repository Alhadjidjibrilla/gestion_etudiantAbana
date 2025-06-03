package com.abana.gestionetudiant.etudiant.dto;

import com.abana.gestionetudiant.etudiant.GenreSexe;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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

        @NotBlank(message = "Veuillez specifier les sexe de cet étudiant")
        GenreSexe sexe,

        String matricule,

        @NotBlank(message = "Veuillez specifier le numero  de telephone de cet étudiant")
        String telephone,
        
        @NotBlank(message = "Veuillez specifier la date de maissance de cet étudiant")
        LocalDate date_naissance,

        @NotBlank(message = "Veuillez specifier le lieu de maissance de cet étudiant")
        String lieu_naissance
) {

}
