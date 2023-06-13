package com.lima.apirest.repository;

import com.lima.apirest.model.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author David
 */
public interface EmpleadoRepository extends JpaRepository<Empleados,Long> {
    
}
