package com.kclick.controllers;

import com.kclick.models.PeliculaSerieModel;
import com.kclick.models.PersonajeModel;
import com.kclick.services.PeliculaSerieService;
import com.kclick.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/peliculaserie")
public class PeliculaSerieController {
    @Autowired
    PeliculaSerieService peliculaSerieService;

    @GetMapping
    public ArrayList<PeliculaSerieModel> getPeliculasSeries(){
        return peliculaSerieService.getPeliculasSeries();
    }

    @PostMapping()
    public PeliculaSerieModel savePeliculaSerie(@RequestBody PeliculaSerieModel peliculaSerie){
        return peliculaSerieService.savePeliculaSerie(peliculaSerie);
    }
}
