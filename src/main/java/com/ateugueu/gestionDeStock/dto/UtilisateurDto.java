package com.ateugueu.gestionDeStock.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {

    private  Integer id;

     private String nom;

     private String prenom;

     private String email;

     private Instant dateDeNaissance;

     private String moteDePasse;

     private AdresseDto adresse;

     private String photo;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}
