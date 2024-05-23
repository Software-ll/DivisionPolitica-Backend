package com.example.divisionpolitica.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.divisionpolitica.model.entity.Departamento;
import com.example.divisionpolitica.model.repository.DepartamentoRepository;

import java.util.List;



@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    
    public Departamento crearDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
    
    public List<Departamento> obtenerTodosLosDepartamentos() {
        return departamentoRepository.findAll();
    }
    
    public Departamento obtenerDepartamentoPorId(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }
    
    public Departamento actualizarDepartamento(Long id, Departamento departamento) {
        Departamento departamentoExistente = departamentoRepository.findById(id).orElse(null);
        if (departamentoExistente != null) {
            departamento.setId(id);
            return departamentoRepository.save(departamento);
        } else {
            return null;
        }
    }
    
    public boolean eliminarDepartamento(Long id) {
        if (departamentoRepository.existsById(id)) {
            departamentoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    } 
}
