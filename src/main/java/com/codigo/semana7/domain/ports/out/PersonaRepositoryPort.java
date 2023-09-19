package com.codigo.semana7.domain.ports.out;

import com.codigo.semana7.domain.model.Persona;

import java.util.Optional;

public interface PersonaRepositoryPort {
    Persona save(Persona persona);
    Optional<Persona> findByid(Long id);
    Persona updateById(Long id, Persona persona);
}
