package com.inventory.premium.premiuminventory.security.model;

import com.inventory.premium.premiuminventory.model.Estados;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;

@Entity
@Table(schema = "dbo", name = "Usuarios")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USUARIOID")
    private int usuarioId;

    @NotNull
    @Column(unique = true, name = "NOMBREUSUARIO")
    private String usuario;

    @NotNull
    @Column(name = "Correo")
    private String correo;

    @NotNull
    @Column(name = "Contrasena")
    private String contrasena;

    @NotNull
    @Column(name = "Nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "ROLID")
    private Roles roles;

    @ManyToOne
    @JoinColumn(name = "ESTADOID")
    private Estados estados;

    public Usuarios(String usuario, String correo, String contrasena, Roles roles, Estados estados) {
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.roles = roles;
        this.estados = estados;
    }
}
