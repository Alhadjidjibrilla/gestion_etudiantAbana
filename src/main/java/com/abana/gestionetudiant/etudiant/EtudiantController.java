package com.abana.gestionetudiant.etudiant;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/etidiants"})
@RequiredArgsConstructor
public class EtudiantController {

    private final EtudiantService service;

//    public EtudiantController(@Qualifier("eServiceV2") EtudiantService service) {
//        this.service = service;
//    }
    // 'eServiceV2 ou eServiceV1' Represente
    // le nom donne a la classe annote par @Service
}
