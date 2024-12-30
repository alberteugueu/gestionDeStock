package com.ateugueu.gestionDeStock.dto;


import com.ateugueu.gestionDeStock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private  Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHT;

    private BigDecimal prixUnitaireTTC;

    private String photo;

    private CategoryDto category;

    public static ArticleDto fromEntity(Article article) {
        if (article == null) {
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .photo(article.getPhoto())
                .prixUnitaireHT(article.getPrixUnitaireHT())
                .prixUnitaireTTC(article.getPrixUnitaireTTC())
//                .tauxTva(article.getTauxTva())
//                .idEntreprise(article.getIdEntreprise())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .build();
    }

    public static Article toEntity(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPhoto(articleDto.getPhoto());
        article.setPrixUnitaireHT(articleDto.getPrixUnitaireHT());
        article.setPrixUnitaireTTC(articleDto.getPrixUnitaireTTC());
//        article.setTauxTva(articleDto.getTauxTva());
//        article.setIdEntreprise(articleDto.getIdEntreprise());
        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
        return article;
    }

}
