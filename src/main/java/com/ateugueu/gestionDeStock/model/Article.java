package com.ateugueu.gestionDeStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="article")
public class Article extends AbstractEntity{

    @Column(name="codeArticle")
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixUnitaireHT")
    private BigDecimal prixUnitaireHT;

    @Column(name="prixUnitaireTTC")
    private BigDecimal prixUnitaireTTC;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idcategory")
    private Category category;
}
