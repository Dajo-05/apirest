/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lima.apirest.service;

import com.lima.apirest.model.Pais;
import com.lima.apirest.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author David
 */
@Service
public class PaisService {
        @Autowired
    private PaisRepository paisRepo;

    public List<Pais> findAll() {
        return this.paisRepo.findAll();
    }
   
}
