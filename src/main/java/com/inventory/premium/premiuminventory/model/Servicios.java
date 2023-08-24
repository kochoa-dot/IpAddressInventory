package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Servicios")
@NoArgsConstructor
@AllArgsConstructor
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICIOID")
    private int servicioId;

    @Column(name = "NOMBRESERVICIO")
    private String servicio;

    @ManyToOne
    @JoinColumn(name = "ENLACEIPID")
    private EnlacesIp enlacesIp;

    @ManyToOne
    @JoinColumn(name = "PROVEEDORID")
    private Proveedores proveedores;

    public Servicios(String nombreServicio, EnlacesIp enlacesIp, Proveedores proveedores) {
        this.servicio = nombreServicio;
        this.enlacesIp = enlacesIp;
        this.proveedores = proveedores;
    }
}
