package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Marcas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marcas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MarcaID")
    private int marcaId;
    @Column(name = "Marca")
    private String marca;

    @ManyToOne
    @JoinColumn(name = "EstadoID")
    private Estados estado;

    public Marcas(String marca, Estados estado){
        this.marca = marca;
        this.estado = estado;
    }
}
