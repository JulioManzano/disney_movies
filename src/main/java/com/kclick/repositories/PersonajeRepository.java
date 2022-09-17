package com.kclick.repositories;

import com.kclick.models.PersonajeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface PersonajeRepository extends CrudRepository<PersonajeModel, Long> {
    ArrayList<PersonajeModel> findByNombre(String nombre);


}
