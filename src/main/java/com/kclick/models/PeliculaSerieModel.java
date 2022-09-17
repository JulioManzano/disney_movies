package com.kclick.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PeliculaSerie")
public class PeliculaSerieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String imagen;
    private String titulo;
    private String fechaCreacion;
    private Integer calificacion;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private GeneroModel genero;


    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<PersonajeModel> personajes = new ArrayList<>();

    public GeneroModel getGenero() {
        return genero;
    }

    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Integer getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }


}
