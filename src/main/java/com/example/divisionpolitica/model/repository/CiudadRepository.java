package com.example.divisionpolitica.model.repository;

import com.example.divisionpolitica.model.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long > {
}
