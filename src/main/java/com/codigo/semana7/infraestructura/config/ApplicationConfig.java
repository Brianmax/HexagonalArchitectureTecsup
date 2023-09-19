package com.codigo.semana7.infraestructura.config;

import com.codigo.semana7.application.service.PersonaService;
import com.codigo.semana7.application.service.UsuarioService;
import com.codigo.semana7.application.useCase.PersonaUseCaseImpl;
import com.codigo.semana7.application.useCase.UsuarioUseCaseImpl;
import com.codigo.semana7.domain.ports.out.PersonaRepositoryPort;
import com.codigo.semana7.domain.ports.out.UsuarioRespositoryPort;
import com.codigo.semana7.infraestructura.repository.PersonaJpaRespositoryAdapter;
import com.codigo.semana7.infraestructura.repository.UsuarioJpaRepository;
import com.codigo.semana7.infraestructura.repository.UsuarioJpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public PersonaService personaService(PersonaRepositoryPort personaRepositoryPort)
    {
        return new PersonaService(new PersonaUseCaseImpl(personaRepositoryPort)); // Inyecta el puerto de salida
    }
    @Bean
    public PersonaRepositoryPort personaRepositoryPort(PersonaJpaRespositoryAdapter personaJpaRespositoryAdapter){
        return personaJpaRespositoryAdapter; // Inyecta el adaptador
    }
    @Bean
    public UsuarioService usuarioService(UsuarioRespositoryPort usuarioRespositoryPort){
        return new UsuarioService(new UsuarioUseCaseImpl(usuarioRespositoryPort));
    }
    @Bean
    public UsuarioRespositoryPort usuarioRespositoryPort(UsuarioJpaRepositoryAdapter usuarioJpaRepositoryAdapter){
        return usuarioJpaRepositoryAdapter;
    }
}
