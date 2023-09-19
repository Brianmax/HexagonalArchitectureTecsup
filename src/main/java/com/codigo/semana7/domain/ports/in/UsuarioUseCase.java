package com.codigo.semana7.domain.ports.in;

import com.codigo.semana7.domain.model.Usuario;

import java.util.Optional;

public interface UsuarioUseCase {
    Usuario crearUsuario(Long id, Usuario usuario);
    Optional<Usuario> getUsuario(Long id);
}
