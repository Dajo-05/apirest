package com.lima.apirest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author David
 */
@Entity
@Data
@Table (name = "pais")
public class Pais implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
     @Column (name = "nombre_pais")
    private String nombrePais;
}

