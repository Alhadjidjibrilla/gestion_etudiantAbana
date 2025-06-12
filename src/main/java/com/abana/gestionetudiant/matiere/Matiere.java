package com.abana.gestionetudiant.matiere;


import com.abana.gestionetudiant.enseignant.Enseignant;
import com.abana.gestionetudiant.etudiant.Etudiant;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "matieres")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private Integer nombreCredit;

    @Column(nullable = false)
    private Integer volumeHoraire;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Enseignant enseignant;

    @ManyToMany
    private List<Etudiant> etudiants = new ArrayList<>();
}
