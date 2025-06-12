package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.carte.Carte;
import com.abana.gestionetudiant.commun.GenreSexe;
import com.abana.gestionetudiant.matiere.Matiere;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "etudiants")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String prenom;

    @Column(nullable = false, unique = true)
    private String matricule;

    @Column(nullable = false, unique = true)
    private String mail;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GenreSexe sexe;

    private String telephone;

    @Column(nullable = false)
    private LocalDate date_naissance; // yyyy-MM-dd

    @Column(nullable = false)
    private String lieu_naissance;

    // Liste des matières

    @ManyToMany
    @JoinTable(
            name = "etudiant_matiere",
            joinColumns = {@JoinColumn(name = "etudiant_id")},
            inverseJoinColumns = {@JoinColumn(name = "matiere_id")})
    private List<Matiere> matieres = new ArrayList<>();

    @OneToOne
    private Carte carte;
}
