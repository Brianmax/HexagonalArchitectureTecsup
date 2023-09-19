package com.codigo.semana7.infraestructura.controller;

import com.codigo.semana7.application.service.PersonaService;
import com.codigo.semana7.application.service.UsuarioService;
import com.codigo.semana7.domain.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping("/crearUsuario")
    public void createUsuario(@PathVariable Long id, Usuario usuario){
        usuarioService.crearUsuario(id, usuario);
    }
}
