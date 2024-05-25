package com.example.divisionpolitica.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "tbl_ciudad")
public class Ciudad {

    @Id
    @Column(precision = 6)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String nombreCiudad;

    @Setter
    @ManyToOne
    @JoinColumn(name = "departamento_id",referencedColumnName = "id", nullable = false)
    private Departamento departamento;
}


