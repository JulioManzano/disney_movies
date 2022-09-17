package com.kclick.services;

import com.kclick.models.GeneroModel;
import com.kclick.models.PersonajeModel;
import com.kclick.repositories.GeneroRepository;
import com.kclick.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GeneroService {
    @Autowired
    GeneroRepository generoRepository;

    public ArrayList<GeneroModel> obtenerGeneros(){
        return (ArrayList<GeneroModel>) generoRepository.findAll();
    }
    public GeneroModel saveGenero(GeneroModel genero){
        return  generoRepository.save(genero);
    }
}
