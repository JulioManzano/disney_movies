package com.kclick.controllers;

import com.kclick.models.GeneroModel;
import com.kclick.models.PersonajeModel;
import com.kclick.services.GeneroService;
import com.kclick.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    GeneroService generoService;

    @GetMapping
    public ArrayList<GeneroModel> getGeneros(){
        return generoService.obtenerGeneros();
    }

    @PostMapping()
    public GeneroModel saveGenero(@RequestBody GeneroModel genero){
        return generoService.saveGenero(genero);
    }
}
