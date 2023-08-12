package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Tiendas")
@NoArgsConstructor
@AllArgsConstructor
public class Tiendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIENDAID")
    private int tiendaId;
    @Column(name = "Tienda")
    private String tienda;

    @ManyToOne
    @JoinColumn(name = "MARCAID")
    private Marcas marcas;

    @ManyToOne
    @JoinColumn(name = "CENTROCOSTOID")
    private CentrosCostos centrosCostos;

    @ManyToOne
    @JoinColumn(name = "EstadoID")
    private Estados estado;

    public Tiendas(String tienda, Marcas marcas, CentrosCostos centrosCostos, Estados estado) {
        this.tienda = tienda;
        this.marcas = marcas;
        this.centrosCostos = centrosCostos;
        this.estado = estado;
    }
}
