package com.abana.gestionetudiant.carte;

import com.abana.gestionetudiant.etudiant.Etudiant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cartes")
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String code;

    @OneToOne(mappedBy = "carte")
    private Etudiant detenteur;
}
