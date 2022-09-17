package com.kclick.controllers;

import com.kclick.models.PersonajeModel;
import com.kclick.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {
    @Autowired
    PersonajeService personajeService;

    @GetMapping
    public ArrayList<PersonajeModel> getPersonajes(){
        return personajeService.getPersonajes();
    }

    @PostMapping()
    public PersonajeModel savePersonaje(@RequestBody PersonajeModel personaje){
        return personajeService.savePersonaje(personaje);
    }

    @GetMapping(path = "/{id}")
    public Optional<PersonajeModel> getPersonajeById(@PathVariable("id") Long id){
        return personajeService.getById(id);
    }
    @GetMapping("/characters")
    public ArrayList<PersonajeModel> getPersonajesByName(@RequestParam("nombre") String nombre){
        return personajeService.getPersonajeByName(nombre);
    }
    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        return personajeService.deletePersonaje(id)
                ? "Se elimino el personaje con el id" : "No se pudo eliminar el personaje con el id";
    }

}
