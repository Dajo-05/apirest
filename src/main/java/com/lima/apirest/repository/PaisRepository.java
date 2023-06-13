package com.lima.apirest.repository;

import com.lima.apirest.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author David
 */
public interface PaisRepository extends JpaRepository<Pais,Long> {
    
}
