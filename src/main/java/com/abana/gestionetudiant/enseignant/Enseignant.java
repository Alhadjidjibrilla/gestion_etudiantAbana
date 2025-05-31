package com.abana.gestionetudiant.enseignant;


import jakarta.persistence.*;
import lombok.*;

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
    private SexeEnseignant sexe;

    private String telephone;

    @Column(nullable = false, unique = true)
    private String mail;

}
