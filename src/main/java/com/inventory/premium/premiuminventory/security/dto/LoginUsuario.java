package com.inventory.premium.premiuminventory.security.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginUsuario {

    @NotBlank
    private String usuario;

    @NotBlank
    private String contrasena;
}
