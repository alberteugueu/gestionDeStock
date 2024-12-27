package com.ateugueu.gestionDeStock.dto;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class FournisseurDto {

     private  Integer id;

     private String nom;

     private String prenom;

     private AdresseDto adresse;

     private String photo;

     private String email;

     private String telephone;

     private List<CommandeFournisseurDto> commandeFournisseurs;
}
