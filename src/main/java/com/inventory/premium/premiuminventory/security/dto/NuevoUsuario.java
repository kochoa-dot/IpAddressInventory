package com.inventory.premium.premiuminventory.security.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Data
public class NuevoUsuario {

    @NotBlank
    private String usuario;

    @NotBlank
    private String nombre;

    @Email
    private String correo;

    @NotBlank
    private String contrasena;

    private Set<String> roles = new HashSet<>();

    private Set<String> estados = new HashSet<>();

}
