package com.abana.gestionetudiant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GestionEtudiantAdviceController {

    @ExceptionHandler(exception = {ElementIntrouvableException.class})
    public ResponseEntity<ErreurApi> gestionDeElementIntrouvableException(
            ElementIntrouvableException exception, WebRequest request) {

        final var erreur = new ErreurApi(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage(),
                request.getDescription(false),
                null);

        return new ResponseEntity<>(erreur, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(exception = {MailDejaUtiliserException.class})
    public ResponseEntity<ErreurApi> gestionMailDejaUtiliserException(
            MailDejaUtiliserException exception, WebRequest request) {
        final var errorMail = new ErreurApi(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                request.getDescription(false),
                null
        );
        return new ResponseEntity<>(errorMail, HttpStatus.BAD_REQUEST);
    }

    // MethodArgumentNotValidException
    @ExceptionHandler(exception = {MethodArgumentNotValidException.class})
    public ResponseEntity<ErreurApi> validationDesEntrees(
            MethodArgumentNotValidException exception, WebRequest request) {

        // Declaration de l'objet devant contenir toutes les possibles erreurs (nom du champ et son message) de validate
        final var erreurs = new HashMap<String, String>();

        // Boucler dans la liste des erreurs et recuperer le nom des champs et les messages correspondants
        exception.getBindingResult().getAllErrors().forEach(objectError -> {
            final var nomDuChamp = ((FieldError) objectError).getField();
            final var messageErreur = objectError.getDefaultMessage();
            erreurs.put(nomDuChamp, messageErreur);
        });

        // Construit notre object reponse qui doit decrire l'erreur et contenir la map des erreurs de validation
        final var erreurApi = new ErreurApi(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Erreur de validation sur les donnees transmis",
                request.getDescription(false),
                erreurs
        );

        // Retourner l'objet creer et le status correspondant a la nature de l'erreur
        return new ResponseEntity<>(erreurApi, HttpStatus.BAD_REQUEST);
    }
}
