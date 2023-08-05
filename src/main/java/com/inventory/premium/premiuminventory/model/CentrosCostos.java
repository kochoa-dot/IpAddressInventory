package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(schema = "dbo", name = "CENTROSCOSTOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CentrosCostos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CENTROCOSTOID")
    private int id_centroCosto;
    @Column(name = "CENTROCOSTO")
    private String centroCosto;

    public CentrosCostos(String centroCosto) {
        this.centroCosto = centroCosto;
    }
}
