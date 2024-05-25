package com.example.divisionpolitica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.divisionpolitica.model.entity.Sector;
import com.example.divisionpolitica.model.service.SectorService;

@RestController
@RequestMapping("/api")
public class SectorController {
    @Autowired
    private SectorService sectorService;


    @GetMapping("/sectores")
    public List<Sector> getSectores() {
        return sectorService.findAllSectores();
    }

    @PostMapping("/sectores")
    public Sector createSector(@RequestBody Sector sector) {
        return sectorService.saveSector(sector);
    }

    @GetMapping("/sectores/{id}/subsectores")
    public List<Sector> getSubSectores(@PathVariable Long id) {
        Sector sectorPadre = sectorService.findSectorById(id);
        return sectorService.findSubSectores(sectorPadre);
    }

    // Otros endpoints según sea necesario
}
