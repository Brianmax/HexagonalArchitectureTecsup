package com.codigo.semana7.domain.ports.in;

import com.codigo.semana7.domain.model.Persona;

import javax.swing.text.html.Option;
import java.util.Optional;
// In port
public interface PersonaUseCase {
    Persona createPersona(Persona persona);
    Optional<Persona> getPersona(Long id);
    Persona updatePersona(Long id, Persona persona);
}