package com.ateugueu.gestionDeStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {

    @Column(name="adresse1")
    private String adresse1;

    @Column(name="adresse2")
    private String adresse2;

    @Column(name="ville")
    private String ville;

    @Column(name="codePostal")
    private String codePostal;

    @Column(name="pays")
    private String pays;
}
