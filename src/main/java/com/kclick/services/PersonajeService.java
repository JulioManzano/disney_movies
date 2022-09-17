package com.kclick.services;

import com.kclick.models.PersonajeModel;
import com.kclick.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonajeService {
    @Autowired
    PersonajeRepository personajeRepository;

    public ArrayList<PersonajeModel> getPersonajes(){
       return (ArrayList<PersonajeModel>) personajeRepository.findAll();
    }
    public PersonajeModel savePersonaje(PersonajeModel personaje){
        return  personajeRepository.save(personaje);
    }

    public Optional<PersonajeModel> getById(Long id){
        return personajeRepository.findById(id);
    }
    public ArrayList<PersonajeModel> getPersonajeByName(String name){
        return personajeRepository.findByNombre(name);
    }
    public boolean deletePersonaje(Long id){
        try{
            personajeRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
 }
