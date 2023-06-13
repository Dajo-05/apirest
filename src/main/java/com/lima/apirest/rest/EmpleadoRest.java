package com.lima.apirest.rest;

import com.lima.apirest.model.Empleados;
import com.lima.apirest.service.EmpleadoService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author David
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/empleados/")
public class EmpleadoRest {

    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping
    private ResponseEntity<List<Empleados>> getAllEmpleados() {
        return ResponseEntity.ok(empleadoService.findAll());
    }

    @PostMapping
    private ResponseEntity<Empleados> saveUsuario(@RequestBody Empleados user) {
        try {
            Empleados usuarioGuardado = empleadoService.save(user);
            return ResponseEntity.created(new URI("/empleados/" + usuarioGuardado.getIdEmpleado())).body(usuarioGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteEmpleado(@PathVariable("id") Long id) {
        empleadoService.deleteById(id);
        return ResponseEntity.ok((empleadoService.findById(id) != null));
    }
    
     @PutMapping
    private void ActualizarEmpleado(@RequestBody Empleados empleado){
        empleadoService.save(empleado);
    }

}
