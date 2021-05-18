package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.usuario;
import com.complexivo.servidesk.service.usuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("usuario")
public class usuarioController {

    @Autowired
    private usuarioService service;
    
    @GetMapping("/listar")
    public List<usuario> listar() {
        return this.service.listar();
    }
    
    @GetMapping("/buscar/{codUsuario}")
    public void buscarUsuario(@PathVariable Long codUsuario) {
        this.service.buscarUsuario(codUsuario);
    }

    @GetMapping("/buscarEmail/{email}")
    public void buscarByEmail(@PathVariable String email) {
        this.service.buscarEmail(email);
    }

    @PostMapping("/crear")
    public usuario crearUsuario(@RequestBody usuario usuario ) {
        return this.service.crearUsuario(usuario);
    }

    @DeleteMapping("/eliminar/{codUsuario}")
    public void eliminarUsuario(@PathVariable Long codUsuario) {
        this.service.eliminarUsuario(codUsuario);
    }

    @PutMapping("/editar/{codUsuario}")
    public usuario editarUsuario(@PathVariable Long codUsuario, @RequestBody usuario usuario) {
       return this.service.editarUsuario(codUsuario, usuario);
    }

}
