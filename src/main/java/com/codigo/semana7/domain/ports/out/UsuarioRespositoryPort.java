package com.codigo.semana7.domain.ports.out;

import com.codigo.semana7.domain.model.Usuario;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UsuarioRespositoryPort {
    Usuario saveUser(Long id, Usuario usuario);
    Optional<Usuario> findUsuarioId(Long id);
}
