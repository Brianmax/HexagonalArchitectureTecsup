package com.codigo.semana7.infraestructura.repository;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.domain.ports.out.PersonaRepositoryPort;
import com.codigo.semana7.infraestructura.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class PersonaJpaRespositoryAdapter implements PersonaRepositoryPort {
    private final PersonaJpaRepository personaJpaRepository;

    public PersonaJpaRespositoryAdapter(PersonaJpaRepository personaJpaRepository) {
        this.personaJpaRepository = personaJpaRepository;
    }

    @Override
    public Persona save(Persona persona) {
        PersonaEntity personaEntity = PersonaEntity.fromDomainModel(persona);
        PersonaEntity savePersonaEntity = personaJpaRepository.save(personaEntity);
        return savePersonaEntity.toDomainModel();
    }

    @Override
    public Optional<Persona> findByid(Long id) {
        return personaJpaRepository.findById(id).map(PersonaEntity::toDomainModel);
    }

    @Override
    public Persona updateById(Long id, Persona persona) {
        PersonaEntity personaEntity = PersonaEntity.fromDomainModel(persona);
        Persona updatePerson = personaJpaRepository.findById(id).map(PersonaEntity::toDomainModel).get();
        updatePerson.setNombre(persona.getNombre());
        updatePerson.setApellido(persona.getApellido());
        updatePerson.setFechaNacimiento(persona.getFechaNacimiento());
        updatePerson.setGenero(persona.getGenero());
        PersonaEntity savePersonaEntity = PersonaEntity.fromDomainModel(updatePerson);
        PersonaEntity updatePersonaEntity = personaJpaRepository.save(savePersonaEntity);
        return updatePersonaEntity.toDomainModel();
    }
}
