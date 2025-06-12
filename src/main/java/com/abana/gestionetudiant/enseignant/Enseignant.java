package com.abana.gestionetudiant.enseignant;


import com.abana.gestionetudiant.commun.GenreSexe;
import com.abana.gestionetudiant.matiere.Matiere;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    @OneToMany
    @JoinColumn(name = "matiere_id")
    private List<Matiere> matieres = new ArrayList<>();

}
