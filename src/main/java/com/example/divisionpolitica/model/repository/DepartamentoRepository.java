package com.example.divisionpolitica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.divisionpolitica.model.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
  
}
