package com.abana.gestionetudiant.carte;

import com.abana.gestionetudiant.carte.dto.CarteRequete;

import java.util.List;

public interface CarteService {
    Carte creer(CarteRequete requete);
    List<Carte> lesCartes();
    Carte leCarte(Integer idCarte);
}
