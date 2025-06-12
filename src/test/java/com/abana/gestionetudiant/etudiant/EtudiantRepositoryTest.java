package com.abana.gestionetudiant.etudiant;

import com.abana.gestionetudiant.commun.GenreSexe;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class EtudiantRepositoryTest {

    @Autowired
    private EtudiantRepository repository;

    @Autowired
    private EntityManager entityManager;

    @Test
    void findByMailIgnoreCase() {
        // Ayant ceci
        final var e1 = Etudiant.builder()
                .nom("Etudiant 1")
                .matricule(UUID.randomUUID().toString())
                .mail("etudiant1@mail.com")
                .sexe(GenreSexe.MASCULIN)
                .date_naissance(LocalDate.now())
                .lieu_naissance("etudiant 1 lieu")
                .build();
        final var e2 = Etudiant.builder()
                .nom("Etudiant 2")
                .matricule(UUID.randomUUID().toString())
                .mail("etudiant2@mail.com")
                .sexe(GenreSexe.MASCULIN)
                .date_naissance(LocalDate.now())
                .lieu_naissance("etudiant 2 lieu")
                .build();
        final var e3 = Etudiant.builder()
                .nom("Etudiant 3")
                .matricule(UUID.randomUUID().toString())
                .mail("etudiant3@mail.com")
                .sexe(GenreSexe.MASCULIN)
                .date_naissance(LocalDate.now())
                .lieu_naissance("etudiant 3 lieu")
                .build();
//        this.repository.saveAll(List.of(e1, e2, e3));
        this.entityManager.persist(e1);
        this.entityManager.persist(e2);
        this.entityManager.persist(e3);

        this.entityManager.flush();
        // En faisant ceci
        final var reponse = this.repository.findByMailIgnoreCase("EtuDiANt3@mail.com");
        // Alors ceci
        assertThat(reponse).isNotEmpty();
        assertThat(reponse.get().getNom()).isEqualTo(e3.getNom());
    }
}