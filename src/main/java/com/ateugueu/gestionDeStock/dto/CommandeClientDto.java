package com.ateugueu.gestionDeStock.dto;

import com.ateugueu.gestionDeStock.model.Client;
import com.ateugueu.gestionDeStock.model.CommandeClient;
import com.ateugueu.gestionDeStock.model.LigneCommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClient;

    public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
        if (commandeClient == null) {
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
//                .etatCommande(commandeClient.getEtatCommande())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
//                .idEntreprise(commandeClient.getIdEntreprise())
                .build();

    }

    public static CommandeClient toEntity(CommandeClientDto dto) {
        if (dto == null) {
            return null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(dto.getId());
        commandeClient.setCode(dto.getCode());
        commandeClient.setClient(ClientDto.toEntity(dto.getClient()));
        commandeClient.setDateCommande(dto.getDateCommande());
//        commandeClient.setEtatCommande(dto.getEtatCommande());
//        commandeClient.setIdEntreprise(dto.getIdEntreprise());
        return commandeClient;
    }

}
