package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Proveedores")
@AllArgsConstructor
@NoArgsConstructor
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProveedorID")
    private int proveedorId;
    @Column(name = "Proveedor")
    private String proveedor;

    public Proveedores(String proveedor) {
        this.proveedor = proveedor;
    }
}
