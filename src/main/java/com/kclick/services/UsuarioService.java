package com.kclick.services;

import com.kclick.models.UsuarioModel;
import com.kclick.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioModel user = usuarioService.findByNombre(username);
        return new User(user.getNombre(),user.getClave(),
                user.isActivo(),user.isActivo(),user.isActivo(),user.isActivo(),buildgranted(user.getRol()));

    }

    public List<GrantedAuthority> buildgranted(byte rol){
        String[] roles = {"LECTOR","USUARIO","ADMINISTRADOR"};
        List<GrantedAuthority> auth = new ArrayList<>();

        for(int i = 0 ;  i < rol; i++){
            auth.add(new SimpleGrantedAuthority(roles[i]));
        }
        return auth;
    }
}
