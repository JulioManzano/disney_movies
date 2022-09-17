package com.kclick.services;

import com.kclick.models.PeliculaSerieModel;
import com.kclick.models.PersonajeModel;
import com.kclick.repositories.PeliculaSerieRepository;
import com.kclick.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PeliculaSerieService {
    @Autowired
    PeliculaSerieRepository peliculaSerieRepository;

    public ArrayList<PeliculaSerieModel> getPeliculasSeries(){
        return (ArrayList<PeliculaSerieModel>) peliculaSerieRepository.findAll();
    }
    public PeliculaSerieModel savePeliculaSerie(PeliculaSerieModel peliculaSerie){
        return  peliculaSerieRepository.save(peliculaSerie);
    }
}
