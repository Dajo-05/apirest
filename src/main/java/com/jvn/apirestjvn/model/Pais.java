package com.jvn.apirestjvn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table (name = "pais")
public class Pais {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
     @Column (name = "nombre_pais")
    private String nombrePais;

       public Pais() {}
    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    
    
}

