package com.example.divisionpolitica.controller;

import com.example.divisionpolitica.model.entity.Ciudad;
import com.example.divisionpolitica.model.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadService service;

    @GetMapping
    public List<Ciudad> getAllCiudad() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ciudad> getById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PostMapping
    public Ciudad save(@RequestBody Ciudad ciudad) {
        return service.save(ciudad);
    }

    @PutMapping("/{id}")
    public Ciudad update(@PathVariable("id") Long id, @RequestBody Ciudad ciudad) {
        Optional<Ciudad> updatedCiudad = service.update(id, ciudad);
        return updatedCiudad.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

}
