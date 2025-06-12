package com.abana.gestionetudiant.enseignant;


import com.abana.gestionetudiant.commun.GenreSexe;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "enseignants")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String prenom;

    @Column(nullable = false)
    private String grade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GenreSexe sexe;

    @Column(nullable = false)
    private LocalDate dateNaissance;

    private String telephone;

    @Column(nullable = false, unique = true)
    private String mail;

    @Column(nullable = false)
    private String specialite;

}
