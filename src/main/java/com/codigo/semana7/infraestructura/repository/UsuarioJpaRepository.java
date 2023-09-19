package com.codigo.semana7.infraestructura.repository;

import com.codigo.semana7.domain.model.Usuario;
import com.codigo.semana7.infraestructura.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long> {
}
