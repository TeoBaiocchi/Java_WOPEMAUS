/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teo.WOPEMAUS.Persona;

import com.teo.WOPEMAUS.Usuario.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wopemaus/usuario")
public class PersonaController {
   
    @Autowired
    UsuarioRepository userSrv;
    

    @GetMapping("/hardcodeado")
    public String crearPersonasHardcodeadas(){

        return "Guardados con exito";
    }
    
//    @GetMapping("/listar")
//    public String listarUsuarios(){
//        String listado = "Los usuario son: \n";
//        for(Usuario usuario : userSrv.findAll()){
//            listado = listado + usuario.getUsername() + "\n";
//        }
//        return listado;
//    }
    
//    @PostMapping("save")
//    public Usuario saveUser(@RequestBody Usuario user){
//        return userSrv.save(user);
//    }
//    //curl http://172.20.224.1:8080/wopemaus/usuario/save -H 'Content-Type: application/json' -d '{"username":"luciano","password":"lol","email":"luciano@gmail"}'
//    
}
