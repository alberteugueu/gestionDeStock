package com.ateugueu.gestionDeStock.dto;

import com.ateugueu.gestionDeStock.model.Client;
import com.ateugueu.gestionDeStock.model.LigneCommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeClientDto {

    private  Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClient;
}
