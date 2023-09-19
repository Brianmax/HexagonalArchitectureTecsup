package com.codigo.semana7.infraestructura.controller;

import com.codigo.semana7.application.service.PersonaService;
import com.codigo.semana7.domain.model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persona")
public class PersonaController {
    private final PersonaService personaService;
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/crearPersona")
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
        Persona crearPersona = personaService.createPersona(persona);
        return new ResponseEntity<>(crearPersona, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Persona> findByid(@PathVariable Long id){
        return personaService.getPersona(id).map(persona -> new ResponseEntity<>(persona, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Persona> updateByid(@PathVariable Long id, @RequestBody Persona persona){
        Persona updatePersona = personaService.updatePersona(id, persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.CREATED);
    }
}
