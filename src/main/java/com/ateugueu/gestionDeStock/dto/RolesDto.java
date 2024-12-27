package com.ateugueu.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {

    private  Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;
}
