package com.ateugueu.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
@Builder
@Data
public class MvtStkDto {

    private  Integer id;

     private Instant dateMvt;

     private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStkDto typeMvt;

}
