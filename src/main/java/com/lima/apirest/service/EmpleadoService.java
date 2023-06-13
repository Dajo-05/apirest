package com.lima.apirest.service;

import com.lima.apirest.model.Empleados;
import com.lima.apirest.repository.EmpleadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author David
 */
@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepo;

   
    public List<Empleados> findAll() {
        
        return empleadoRepo.findAll();
    }

    public <S extends Empleados> S save(S entity) {
        return empleadoRepo.save(entity);
    }

    public Optional<Empleados> findById(Long id) {
        return empleadoRepo.findById(id);
    }

    public void deleteById(Long id) {
        empleadoRepo.deleteById(id);
    }
    
    
}
