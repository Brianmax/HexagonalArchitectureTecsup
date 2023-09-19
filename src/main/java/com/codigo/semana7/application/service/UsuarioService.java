package com.codigo.semana7.application.service;

import com.codigo.semana7.domain.model.Usuario;
import com.codigo.semana7.domain.ports.in.PersonaUseCase;
import com.codigo.semana7.domain.ports.in.UsuarioUseCase;

import java.util.Optional;

public class UsuarioService implements UsuarioUseCase {
    private final UsuarioUseCase usuarioUseCase; // usuarioUseCaseImpl

    public UsuarioService(UsuarioUseCase usuarioUseCase) {
        this.usuarioUseCase = usuarioUseCase;
    }

    @Override
    public Usuario crearUsuario(Long id, Usuario usuario) {
        return usuarioUseCase.crearUsuario(id, usuario); // id persona, usuario
    }

    @Override
    public Optional<Usuario> getUsuario(Long id) {
        return Optional.empty();
    }
}
