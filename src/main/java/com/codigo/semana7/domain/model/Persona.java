package com.codigo.semana7.domain.model;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Persona {
    @Getter @Setter private Long Id;
    @Getter @Setter private String nombre;
    @Getter @Setter private String apellido;
    @Getter @Setter private Date fechaNacimiento;
    @Getter @Setter private String genero;
    @Getter @Setter private Usuario usuario;
    public Persona(Long Id, String nombre, String apellido, Date fechaNacimiento, String genero) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
}
