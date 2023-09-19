package com.codigo.semana7.application.useCase;

import com.codigo.semana7.domain.model.Usuario;
import com.codigo.semana7.domain.ports.in.UsuarioUseCase;
import com.codigo.semana7.domain.ports.out.UsuarioRespositoryPort;

import java.util.Optional;

public class UsuarioUseCaseImpl implements UsuarioUseCase {
    private final UsuarioRespositoryPort usuarioRespositoryPort;
    public UsuarioUseCaseImpl(UsuarioRespositoryPort usuarioRespositoryPort){
        this.usuarioRespositoryPort = usuarioRespositoryPort;
    }
    @Override
    public Usuario crearUsuario(Long id, Usuario usuario) {
        return usuarioRespositoryPort.saveUser(id, usuario);
    }
    @Override
    public Optional<Usuario> getUsuario(Long id) {
        return Optional.empty();
    }
}
