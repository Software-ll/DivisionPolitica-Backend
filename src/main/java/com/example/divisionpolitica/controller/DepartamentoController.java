package com.example.divisionpolitica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.divisionpolitica.model.entity.Departamento;
import com.example.divisionpolitica.model.service.DepartamentoService;

import java.util.List;


@RestController
@RequestMapping("api/v1/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public List<Departamento> getAll(){
        return departamentoService.obtenerTodosLosDepartamentos();
    }

    @GetMapping("/{departamentoId}")
    public ResponseEntity<Departamento> getById(@PathVariable("departamentoId") Long departamentoId){
        Departamento departamento = departamentoService.obtenerDepartamentoPorId(departamentoId);
        if (departamento != null) {
            return new ResponseEntity<>(departamento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Departamento saveOrUpdate(@RequestBody Departamento departamento){
        return departamentoService.crearDepartamento(departamento);
    }

    @DeleteMapping("/{departamentoId}")
    public void delete(@PathVariable("departamentoId") Long departamentoId){
        departamentoService.eliminarDepartamento(departamentoId);
    }
}
