package com.abana.gestionetudiant.matiere;

import com.abana.gestionetudiant.enseignant.Enseignant;

public interface MatiereService {

    Matiere getMatiereById(Long id);
    Matiere create(Matiere newMatiere);
}
