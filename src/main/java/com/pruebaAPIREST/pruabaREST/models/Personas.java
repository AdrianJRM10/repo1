package com.pruebaAPIREST.pruabaREST.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personas {
    @Id
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Integer edad;
    //Getter and Setter of Person´s Model
    public void setId (Integer id) {
        this.id = id;
    }
    public int getId () {
        return id;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return nombre;
    }
    public void setApellido (String apellido) {
        this.apellido = apellido;
    }
    public String getApellido () {
        return apellido;
    }
    public void setEdad (Integer edad) {
        this.edad = edad;
    }
    public int getEdad () {
        return edad;
    }
}
