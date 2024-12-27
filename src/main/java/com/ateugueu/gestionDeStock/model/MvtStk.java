package com.ateugueu.gestionDeStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mvtStk")
public class MvtStk extends AbstractEntity{

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

//    @Column(name = "typemvt")
//    @Enumerated(EnumType.STRING)
//    private TypeMvtStk typeMvt;


}
