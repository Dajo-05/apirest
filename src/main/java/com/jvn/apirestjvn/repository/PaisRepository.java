package com.jvn.apirestjvn.repository;

import com.jvn.apirestjvn.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author David
 */
public interface PaisRepository extends JpaRepository<Pais,Long> {
    
}
