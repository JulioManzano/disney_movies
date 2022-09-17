package com.kclick.repositories;

import com.kclick.models.GeneroModel;
import com.kclick.models.PersonajeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<GeneroModel, Long> {
}
