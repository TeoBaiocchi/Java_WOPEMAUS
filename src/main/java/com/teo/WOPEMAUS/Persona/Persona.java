/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teo.WOPEMAUS.Persona;

import com.teo.WOPEMAUS.Direccion.Direccion;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;

@Entity
@Data
public class Persona {
    private String nombre;
    private String apellido;
    
    @ManyToMany(mappedBy="personas")
    private Set<Direccion> direcciones;
}
