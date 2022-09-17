package com.kclick.repositories;

import com.kclick.models.GeneroModel;
import com.kclick.models.PeliculaSerieModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaSerieRepository extends CrudRepository<PeliculaSerieModel, Long> {
}
