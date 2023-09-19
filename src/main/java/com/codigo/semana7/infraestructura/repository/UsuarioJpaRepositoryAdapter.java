package com.codigo.semana7.infraestructura.repository;

import com.codigo.semana7.domain.model.Usuario;
import com.codigo.semana7.domain.ports.out.UsuarioRespositoryPort;
import com.codigo.semana7.infraestructura.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioJpaRepositoryAdapter implements UsuarioRespositoryPort {
    private final UsuarioJpaRepository usuarioJpaRepository;

    public UsuarioJpaRepositoryAdapter(UsuarioJpaRepository usuarioJpaRepository) {
        this.usuarioJpaRepository = usuarioJpaRepository;
    }

    @Override
    public Usuario saveUser(Long id, Usuario usuario) {
        UsuarioEntity usuarioEntity = UsuarioEntity.fromDomainModel(usuario);
        UsuarioEntity saveUsuarioEntity = usuarioJpaRepository.save(usuarioEntity);
        return saveUsuarioEntity.toDomainModel();
    }
    @Override
    public Optional<Usuario> findUsuarioId(Long id) {
        return Optional.empty();
    }
}