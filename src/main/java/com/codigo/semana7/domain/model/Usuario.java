package com.codigo.semana7.domain.model;

import lombok.Getter;
import lombok.Setter;

// Person could have only one User associated to him
public class Usuario {
    @Getter @Setter private Long id;
    @Getter @Setter private String nombreUsuario;
    @Getter @Setter private String contrasenia;
    @Getter @Setter private String correoElectronico;
    @Getter @Setter private Persona persona;

    public Usuario(Long id, String nombreUsuario, String contrasenia, String correoElectronico, Persona persona) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.persona = persona;
    }
}
