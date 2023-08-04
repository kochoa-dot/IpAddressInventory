package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Estados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estados implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoID")
    private int estadoId;
    @Column(name = "Estado")
    private String estado;

    public Estados(String estado){
        this.estado = estado;
    }
}
