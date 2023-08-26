package com.inventory.premium.premiuminventory.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioPrincipal implements UserDetails {

    private String usuario;
    private String nombre;
    private String correo;
    private String contrasena;
    private Collection<? extends GrantedAuthority> authorities;

    public UsuarioPrincipal(String usuario, String nombre, String correo, String contrasena, Collection<? extends GrantedAuthority> authorities) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal build(Usuarios usuarios) {
        GrantedAuthority authority = new SimpleGrantedAuthority(usuarios.getRoles().getRolName());
        return new UsuarioPrincipal(usuarios.getUsuario(), usuarios.getNombre(), usuarios.getCorreo(), usuarios.getContrasena(), Collections.singletonList(authority));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return authorities;
    }

    @Override
    public String getPassword(){
        return contrasena;
    }

    @Override
    public String getUsername(){
        return usuario;
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isEnabled(){
        return true;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }

}
