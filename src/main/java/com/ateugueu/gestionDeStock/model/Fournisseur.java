package com.ateugueu.gestionDeStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name="photo")
    private String photo;

    @Column(name="email")
    private String email;

    @Column(name="telephone")
    private String telephone;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;

}
