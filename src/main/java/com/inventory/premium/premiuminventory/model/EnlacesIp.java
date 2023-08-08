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
}
