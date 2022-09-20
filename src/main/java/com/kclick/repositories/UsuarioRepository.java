package com.kclick.repositories;

import com.kclick.models.GeneroModel;
import com.kclick.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Serializable> {
    UsuarioModel findByNombre(String username);

}
