/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teo.WOPEMAUS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("wopemaus")
public class HolaController {
   
    @Autowired
    UsuarioRepository userSrv;
    
    @GetMapping("/hola")
    public String hello(){
        return "hola";
    }
    
    @GetMapping("/hardcodeado")
    public String crearUsuariosHardcodeado(){
        Usuario usr = new Usuario();
        usr.setUsername("andres");
        userSrv.save(usr);
        
        Usuario usr2 = new Usuario();
        usr2.setUsername("teo");
        userSrv.save(usr2);
  
        return "Guardado con exito";
    }
    
    @GetMapping("/listarUsuarios")
    public String listarUsuarios(){

        String listado = "Los usuario son: \n";
        for(Usuario usuario : userSrv.findAll()){
            listado = listado + usuario.getUsername() + "\n";
        }
        
        return listado;
    }
    
    @PostMapping("usuarios")
    public Usuario saveUser(@RequestBody Usuario user){
        return userSrv.save(user);
    }
    
    //curl http://172.20.224.1:8080/wopemaus/usuarios -H 'Content-Type: application/json' -d '{"username":"luciano","password":"lol","email":"luciano@gmail"}'
    
}
