package com.inventory.premium.premiuminventory.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.io.Serializable;

@Entity
@Table(schema = "dbo",name = "Roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLESID")
    private int rolId;
    @Column(name = "NOMBREROL")
    private String rolName;

    public Roles(String rolName) {
        this.rolName = rolName;
    }
}
