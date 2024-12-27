package com.ateugueu.gestionDeStock.dto;

import com.ateugueu.gestionDeStock.model.Adresse;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class ClientDto {

    private  Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String telephone;

    private List<CommandeClientDto> commandeClient;
}
