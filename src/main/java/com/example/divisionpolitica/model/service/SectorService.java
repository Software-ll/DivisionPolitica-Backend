package com.example.divisionpolitica.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.divisionpolitica.model.entity.Sector;
import com.example.divisionpolitica.model.repository.SectorRepository;

@Service
public class SectorService {

    @Autowired
    private SectorRepository sectorRepository;

    public List<Sector> findAllSectores() {
        return sectorRepository.findAll();
    }

    public Sector saveSector(Sector sector) {
        return sectorRepository.save(sector);
    }

    public List<Sector> findSubSectores(Sector sectorPadre) {
        return sectorRepository.findBySectorPadre(sectorPadre);
    }

    public Sector findSectorById(Long id) {
        return sectorRepository.findById(id).orElse(null);
    }



}
