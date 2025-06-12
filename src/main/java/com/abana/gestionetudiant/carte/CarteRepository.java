package com.abana.gestionetudiant.carte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Integer> {
}
