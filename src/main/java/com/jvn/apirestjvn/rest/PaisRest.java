package com.jvn.apirestjvn.rest;

import com.jvn.apirestjvn.model.Pais;
import com.jvn.apirestjvn.repository.PaisRepository;
import com.jvn.apirestjvn.service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author David
 */
@CrossOrigin( origins = {"http://localhost:4200"})
@RestController
@RequestMapping ("/pais/")
public class PaisRest {
        @Autowired
    private PaisService paisService;
    
   /* @Autowired
    public PaisRest(@Lazy  PaisService paisService){
        this.paisService = paisService;
    }*/
    
    @RequestMapping
    private ResponseEntity<List<Pais>> getAllPaises(){
        return ResponseEntity.ok(paisService.findAll());
    }
    
}