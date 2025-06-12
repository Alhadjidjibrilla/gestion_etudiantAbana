package com.abana.gestionetudiant.enseignant;

public interface EnseignantService {
    Enseignant getEnseignantById(Long id);
    Enseignant create(Enseignant newEnseignant);
}
