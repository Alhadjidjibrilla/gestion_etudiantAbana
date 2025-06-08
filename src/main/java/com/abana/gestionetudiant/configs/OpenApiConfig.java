package com.abana.gestionetudiant.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Gestion des Etudiants")
                        .version("1.0.0")
                        .description("Ceci est une API  de gestion des etudiants, des matieres et les enseignants qui les dispensent")
                        .contact(new Contact()
                                .name("Aladji Abana")
                                .email("aladjiabana@gmail.com")
                                .url("https://yourwebsite.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Local Development server"),
                        new Server().url("https://api.yourdomain.com").description("Production server")
                ));
    }

}
