package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.etudiant.dto.EtudiantReponse;
import com.abana.gestionetudiant.etudiant.dto.EtudiantRequete;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"/api/v1/etudiants"})
@RequiredArgsConstructor
public class EtudiantRestController {

    private final EtudiantService service;

    @PostMapping
    public ResponseEntity<EtudiantReponse> enregistrerNouveau(final @Valid @RequestBody EtudiantRequete nouveauEtudiant) {
        final var reponse = this.service.creer(nouveauEtudiant);
        return new ResponseEntity<>(reponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EtudiantReponse>> tousEtudiants() {
        return new ResponseEntity<>(this.service.tousLesEtudiants(), HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<EtudiantReponse> etudiantParId(final @PathVariable Long id) {
        return new ResponseEntity<>(this.service.recupererParId(id), HttpStatus.OK);
    }
}
