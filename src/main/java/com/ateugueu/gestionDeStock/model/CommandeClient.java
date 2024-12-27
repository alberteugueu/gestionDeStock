package com.ateugueu.gestionDeStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="commandeClient")
public class CommandeClient extends AbstractEntity{

    @Column(name="code")
    private String code;

    @Column(name="dateCommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
