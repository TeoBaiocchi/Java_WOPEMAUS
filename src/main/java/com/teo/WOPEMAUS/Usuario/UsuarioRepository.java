/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teo.WOPEMAUS.Usuario;

import com.teo.WOPEMAUS.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Innecesario
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
