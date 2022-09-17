package com.kclick.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="genero")
public class GeneroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;
    private String imagen;

    @OneToMany()
    @JoinTable(
        name = "genero_peliculas_series",
        joinColumns = @JoinColumn(name = "genero_id"),
        inverseJoinColumns = @JoinColumn(name = "pelicula_serie_id")
    )
    private List<PeliculaSerieModel> peliculasSeriesAsociados = new ArrayList<>();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
