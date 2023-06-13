package com.lima.apirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author David
 */
@Entity
@Data
@Table (name = "empleados")
public class Empleados implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleado;
    private String primerNombre;
    private String primerApellido;
    private String otroNombre;
    private String paisEmpleo;
    private String correo;
    
    @ManyToOne
    @JoinColumn (name = "IdPais")
    private Pais pais;  
    
}
