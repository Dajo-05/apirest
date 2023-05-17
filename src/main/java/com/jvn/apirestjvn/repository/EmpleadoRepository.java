package com.jvn.apirestjvn.repository;

import com.jvn.apirestjvn.model.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author David
 */
public interface EmpleadoRepository extends JpaRepository<Empleados,Long> {
    
}
