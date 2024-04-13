/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teo.WOPEMAUS.Direccion;

import com.teo.WOPEMAUS.Persona.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;

@Entity
@Data
public class Direccion {
    private String calle;
    private String piso;
    private String nro;
    
    @ManyToMany
    private Set<Persona> inquilinos;
}
