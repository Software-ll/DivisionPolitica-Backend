package com.example.divisionpolitica.model.service;

import com.example.divisionpolitica.model.entity.Ciudad;
import com.example.divisionpolitica.model.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {

    @Autowired
    private CiudadRepository repository;

    public List<Ciudad> findAll() {
        return repository.findAll();
    }

    public Optional<Ciudad> findById(Long id) {
        return repository.findById(id);
    }

    public Ciudad save(Ciudad ciudad) {
        return repository.save(ciudad);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Ciudad> update(Long id, Ciudad ciudad) {
        return repository.findById(id).map(existingCiudad -> {
            existingCiudad.setNombreCiudad(ciudad.getNombreCiudad());
            existingCiudad.setDepartamento(ciudad.getDepartamento());
            return repository.save(existingCiudad);
        });
    }



}
