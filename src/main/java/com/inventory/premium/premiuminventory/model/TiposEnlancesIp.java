package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "TIPOSENLACESIP")
@AllArgsConstructor
@NoArgsConstructor
public class TiposEnlancesIp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIPOENLACEIPID")
    private int tipoEnlaceId;
    @Column(name = "TIPOENLACE")
    private String tipoEnlace;

    public TiposEnlancesIp(String tipoEnlace) {
        this.tipoEnlace = tipoEnlace;
    }
}
