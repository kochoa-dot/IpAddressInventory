package com.inventory.premium.premiuminventory.security.service;

import com.inventory.premium.premiuminventory.security.model.UsuarioPrincipal;
import com.inventory.premium.premiuminventory.security.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuariosService usuariosService;

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        Usuarios usuarios = usuariosService.getByNombreUsuario(usuario).get();
        return UsuarioPrincipal.build(usuarios);
    }
}
