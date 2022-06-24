package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Pais;
import net.guides.springboot2.crud.repository.PaisRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
public class PaisController {
	@Autowired
	private PaisRepository paisRepository;

        
        @GetMapping("/Pais/Region/{id}")
                        @CrossOrigin
	public ResponseEntity<List<Pais>> getPaisByRegionId(@PathVariable(value = "id") Long regionId){
            return new ResponseEntity<List<Pais>>( paisRepository.findByRegion(regionId), HttpStatus.OK);      
	}


}
