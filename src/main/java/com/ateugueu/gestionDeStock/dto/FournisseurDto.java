package com.ateugueu.gestionDeStock.dto;
import com.ateugueu.gestionDeStock.model.Fournisseur;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

     @JsonIgnore
     private List<CommandeFournisseurDto> commandeFournisseurs;

     public static FournisseurDto fromEntity(Fournisseur fournisseur) {
          if (fournisseur == null) {
               return null;
          }
          return FournisseurDto.builder()
                  .id(fournisseur.getId())
                  .nom(fournisseur.getNom())
                  .prenom(fournisseur.getPrenom())
                  .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                  .photo(fournisseur.getPhoto())
                  .email(fournisseur.getEmail())
                  .telephone(fournisseur.getTelephone())
//                  .idEntreprise(fournisseur.getIdEntreprise())
                  .build();
     }

     public static Fournisseur toEntity(FournisseurDto dto) {
          if (dto == null) {
               return null;
          }
          Fournisseur fournisseur = new Fournisseur();
          fournisseur.setId(dto.getId());
          fournisseur.setNom(dto.getNom());
          fournisseur.setPrenom(dto.getPrenom());
          fournisseur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
          fournisseur.setPhoto(dto.getPhoto());
          fournisseur.setEmail(dto.getEmail());
          fournisseur.setTelephone(dto.getTelephone());
//          fournisseur.setIdEntreprise(dto.getIdEntreprise());

          return fournisseur;
     }
}
