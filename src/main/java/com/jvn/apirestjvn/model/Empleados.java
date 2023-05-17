package com.jvn.apirestjvn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table (name = "empleados")
public class Empleados {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;
    private String primerNombre;
    private String primerApellido;
    private String otroNombre;
    private String paisEmpleo;
    private String correo;
    
    @ManyToOne
    @JoinColumn (name = "IdPais")
    private Pais pais;
    
    public Empleados(){}

    public Empleados(String primerNombre, String primerApellido, String otroNombre, String paisEmpleo, String correo, Pais pais) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.otroNombre = otroNombre;
        this.paisEmpleo = paisEmpleo;
        this.correo = correo;
        this.pais = pais;
    }
    
     

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getOtroNombre() {
        return otroNombre;
    }

    public void setOtroNombre(String otroNombre) {
        this.otroNombre = otroNombre;
    }

    public String getPaisEmpleo() {
        return paisEmpleo;
    }

    public void setPaisEmpleo(String paisEmpleo) {
        this.paisEmpleo = paisEmpleo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    
}
