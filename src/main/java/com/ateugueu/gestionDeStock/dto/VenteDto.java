package com.ateugueu.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class VenteDto {

    private  Integer id;

     private String code;

     private Instant dateVente;

     private String commentaire;
}
