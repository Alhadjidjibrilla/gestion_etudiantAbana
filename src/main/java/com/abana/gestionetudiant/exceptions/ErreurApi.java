package com.abana.gestionetudiant.exceptions;

import java.time.LocalDateTime;
import java.util.Map;

public record ErreurApi(
        LocalDateTime timestamp,
        Integer status,
        String message,
        String path,
        Map<String, String> errors
) {
}
