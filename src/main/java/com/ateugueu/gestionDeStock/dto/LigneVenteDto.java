package com.ateugueu.gestionDeStock.dto;

 import com.ateugueu.gestionDeStock.model.LigneVente;
 import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class LigneVenteDto {

    private  Integer id;

    private VenteDto vente;

    private ArticleDto article;

     private BigDecimal quantite;

     private BigDecimal prixUnitaire;

    public static LigneVenteDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .vente(VenteDto.fromEntity(ligneVente.getVente()))
                .article(ArticleDto.fromEntity(ligneVente.getArticle()))
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
//                .idEntreprise(ligneVente.getIdEntreprise())
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto dto) {
        if (dto == null) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(dto.getId());
        ligneVente.setVente(VenteDto.toEntity(dto.getVente()));
        ligneVente.setArticle(ArticleDto.toEntity(dto.getArticle()));
        ligneVente.setQuantite(dto.getQuantite());
        ligneVente.setPrixUnitaire(dto.getPrixUnitaire());
//        ligneVente.setIdEntreprise(dto.getIdEntreprise());
        return ligneVente;
    }
}
