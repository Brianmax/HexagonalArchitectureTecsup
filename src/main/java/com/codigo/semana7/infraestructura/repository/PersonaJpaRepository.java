package com.codigo.semana7.infraestructura.repository;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.infraestructura.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, Long> {

}
