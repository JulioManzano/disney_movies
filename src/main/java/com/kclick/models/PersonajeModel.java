package com.kclick.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="personaje")
public class PersonajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String imagen;
    private String nombre;
    private Integer edad;
    private Long peso;
    private String historia;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<PeliculaSerieModel> peliculasSeries = new ArrayList<>();

    //private List<Peliculas> peliculas;
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Long getPeso() {
        return peso;
    }
    public void setPeso(Long peso) {
        this.peso = peso;
    }
    public String getHistoria() {
        return historia;
    }
    public void setHistoria(String historia) {
        this.historia = historia;
    }



    public Long getId() {
        return id;
    }

}
