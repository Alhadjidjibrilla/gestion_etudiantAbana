package com.abana.gestionetudiant.matiere;

import com.abana.gestionetudiant.enseignant.Enseignant;
import com.abana.gestionetudiant.enseignant.EnseignantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatiereServiceImpl implements EnseignantService {

    @Override
    public Enseignant getEnseignantById(Long id) {
        return null;
    }

    @Override
    public Enseignant create(Enseignant newEnseignant) {
        return null;
    }
}
