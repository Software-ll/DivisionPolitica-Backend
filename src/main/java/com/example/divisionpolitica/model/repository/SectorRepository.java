package com.example.divisionpolitica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.divisionpolitica.model.entity.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {
    List<Sector> findBySectorPadre(Sector sectorPadre);
}