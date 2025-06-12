package com.abana.gestionetudiant.carte;

import com.abana.gestionetudiant.carte.dto.CarteRequete;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteServiceImpl implements CarteService {
    @Override
    public Carte creer(CarteRequete requete) {
        return null;
    }

    @Override
    public List<Carte> lesCartes() {
        return List.of();
    }

    @Override
    public Carte leCarte(Integer idCarte) {
        return null;
    }
}
