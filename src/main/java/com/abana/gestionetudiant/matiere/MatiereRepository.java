package com.abana.gestionetudiant.matiere;


import com.abana.gestionetudiant.enseignant.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {

}
