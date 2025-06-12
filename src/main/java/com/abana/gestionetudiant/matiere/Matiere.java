package com.abana.gestionetudiant.matiere;


import jakarta.persistence.*;
import lombok.*;

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
    private String credit;

    @Column(nullable = false)
    private Integer nombreCredit;

    @Column(nullable = false)
    private Integer volumeHoraire;

}
