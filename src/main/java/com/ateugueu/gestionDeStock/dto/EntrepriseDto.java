package com.ateugueu.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class EntrepriseDto {

     private  Integer id;

     private String nom;

     private String description;

     private AdresseDto adresse;

     private String codeFiscal;

     private String photo;

     private String email;

     private String telephone;

     private String siteWeb;

     private List<UtilisateurDto> utilisateurs;
}
