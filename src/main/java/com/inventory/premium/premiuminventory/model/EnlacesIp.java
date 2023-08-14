package com.inventory.premium.premiuminventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "ENLACESIP")
@NoArgsConstructor
@AllArgsConstructor
public class EnlacesIp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENLACEIPID")
    private int enlaceIpId;

    @Column(name = "DIRECCIONIP")
    private String direccionIp;

    @ManyToOne
    @JoinColumn(name = "TIENDAID")
    private Tiendas tienda;

    @ManyToOne
    @JoinColumn(name = "TIPOENLACEIPID")
    private TiposEnlancesIp tipoEnlanceIp;

    public EnlacesIp(String direccionIp, Tiendas tienda, TiposEnlancesIp tipoEnlanceIp) {
        this.direccionIp = direccionIp;
        this.tienda = tienda;
        this.tipoEnlanceIp = tipoEnlanceIp;
    }
}
