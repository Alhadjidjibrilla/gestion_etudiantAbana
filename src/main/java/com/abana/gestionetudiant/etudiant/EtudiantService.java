package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;
import com.abana.gestionetudiant.etudiant.dto.EtudiantRequete;

import java.util.List;

public interface EtudiantService {
    EtudiantReponse create(EtudiantRequete requete);
    List<EtudiantReponse> tousLesEtudiants();
}
