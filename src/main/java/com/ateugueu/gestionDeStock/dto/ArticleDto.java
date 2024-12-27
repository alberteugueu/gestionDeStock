package com.ateugueu.gestionDeStock.dto;


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
}
