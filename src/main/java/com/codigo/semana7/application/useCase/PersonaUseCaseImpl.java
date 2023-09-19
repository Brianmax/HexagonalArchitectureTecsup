package com.codigo.semana7.application.useCase;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.domain.ports.in.PersonaUseCase;
import com.codigo.semana7.domain.ports.out.PersonaRepositoryPort;
import com.codigo.semana7.infraestructura.entity.PersonaEntity;

import java.util.Optional;
// Invoca al puerto de salida para realizar la consulta
public class PersonaUseCaseImpl implements PersonaUseCase{
    private final PersonaRepositoryPort personaRepositoryPort;

    public PersonaUseCaseImpl(PersonaRepositoryPort personaRepositoryPort) {
        this.personaRepositoryPort = personaRepositoryPort;
    }

    @Override
    public Persona createPersona(Persona persona) {
        return personaRepositoryPort.save(persona);
    }

    @Override
    public Optional<Persona> getPersona(Long id) {
        return personaRepositoryPort.findByid(id);
    }

    @Override
    public Persona updatePersona(Long id, Persona persona) {
        return personaRepositoryPort.updateById(id, persona);
    }

}
