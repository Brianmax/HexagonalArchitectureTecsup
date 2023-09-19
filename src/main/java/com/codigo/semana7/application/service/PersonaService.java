package com.codigo.semana7.application.service;

import com.codigo.semana7.application.useCase.PersonaUseCaseImpl;
import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.domain.ports.in.PersonaUseCase;
import java.util.Optional;
// Ingresa datos al puerto
public class PersonaService implements PersonaUseCase {
    private final PersonaUseCase personaUseCase; // PersonaUseCaseImpl

    public PersonaService(PersonaUseCase personaUseCase) {
        this.personaUseCase = personaUseCase;
    }
    @Override
    public Persona createPersona(Persona persona) {
        return personaUseCase.createPersona(persona); // PersonaUseCaseImpl.createPersona
    }
    @Override
    public Optional<Persona> getPersona(Long id) {
        return Optional.empty();
    }
    @Override
    public Persona updatePersona(Long id, Persona persona) {
        return personaUseCase.updatePersona(id, persona);
    }
}
