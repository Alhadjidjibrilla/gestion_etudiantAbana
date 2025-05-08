package com.abana.gestionetudiant.etudiant;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

import static com.abana.gestionetudiant.etudiant.GenreSexe.MASCULIN;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String prenom;

    @Column(nullable = false, length = 8, unique = true)
    private String matricule;

    @Column(nullable = false, unique = true)
    private String mail;

    @Enumerated(STRING)
    @Column(nullable = false)
    private GenreSexe sexe = MASCULIN;

    private String telephone;

    @Column(nullable = false)
    private LocalDate date_naissance; // yyyy-MM-dd

    @Column(nullable = false)
    private String lieu_naissance;

    // Liste des matières
}
