package com.jvn.apirestjvn.rest;

import com.jvn.apirestjvn.model.Empleados;
import com.jvn.apirestjvn.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author David
 */

@RestController
@RequestMapping ("/empleados/")
public class EmpleadoRest {
    
     @Autowired
     private EmpleadoService empleadoService;
     
     @RequestMapping
    private ResponseEntity<List<Empleados>> getAllEmpleados (){
        return ResponseEntity.ok(empleadoService.findAll());
    }
    
}
