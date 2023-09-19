package com.codigo.semana7.infraestructura.entity;

import com.codigo.semana7.domain.model.Persona;
import com.codigo.semana7.domain.model.Usuario;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreUsuario;
    private String contrasenia;
    private String correoElectronico;
    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private PersonaEntity personaEntity;

    public UsuarioEntity(Long id, String nombreUsuario, String contrasenia, String correoElectronico, PersonaEntity personaEntity) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.personaEntity = personaEntity;
    }

    public UsuarioEntity() {
    }

    public static UsuarioEntity fromDomainModel(Usuario usuario){
        return new UsuarioEntity(
                usuario.getId(),
                usuario.getNombreUsuario(),
                usuario.getContrasenia(),
                usuario.getCorreoElectronico(),
                PersonaEntity.fromDomainModel(usuario.getPersona()));
    }
    public Usuario toDomainModel(){
        return new Usuario(id, nombreUsuario, contrasenia, correoElectronico, personaEntity.toDomainModel());
    }
}
