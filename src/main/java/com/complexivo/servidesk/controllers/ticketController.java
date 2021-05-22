/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.controllers;

import com.complexivo.servidesk.models.ticket;
import com.complexivo.servidesk.repository.ticketRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import com.complexivo.servidesk.service.ticketService;

/**
 *
 * @author AlexanderGuzman
 */
@RestController
@RequestMapping("ticket")
public class ticketController {
    @Autowired
    ticketService service;

    @GetMapping("/listar")
    @CrossOrigin
    public List<ticket> listar() {
        return this.service.listarTodo();

    }

    @GetMapping("/listar/{codTicket}")
    @CrossOrigin
    public List<ticket> listarByIdTicket(@PathVariable Long codTicket) {
        return this.service.getTicketByID(codTicket);
    }

    @PostMapping("/guardar")
    @CrossOrigin
    public ticket guardar(@RequestBody ticket e) {
        return this.service.crearTicket(e);
    }

    @GetMapping("/tecnico/{codTecnico}")
    @CrossOrigin
    public List<ticket> tickeTecnico(@PathVariable Long codTecnico) {
        return this.service.tickeTecnico(codTecnico);
    }

    @DeleteMapping("/{codTicket}")
    @CrossOrigin
    public void eliminar(@PathVariable Long codTicket) {
        this.service.eliminar(codTicket);
    }
    /*
     * @PutMapping("/estado/{codTicket}")
     * 
     * @CrossOrigin public ticket editarEstado(@PathVariable Long
     * codTicket, @RequestBody ticket ticket1) { return
     * service.editarEstado(codTicket,ticket1); }
     */

    @PutMapping("/fecha_asignacion/{codTicket}")
    @CrossOrigin
    public ticket editarFechaAsignacion(@PathVariable Long codTicket, @RequestBody ticket ticket1) {
        return service.editarFechaAsignacion(codTicket, ticket1);
    }
     
    @PutMapping("/asignarTecnico/{cod_tecnico}/{codticket}")
    @CrossOrigin
    public void asignarTecnicoTicket(@PathVariable Long cod_tecnico,@PathVariable Long codticket) {
        this.service.asignarTecnicoTicket(cod_tecnico, codticket);
    }
    @PutMapping("/cambiar_severidad/{cod_severidad}/{codticket}")
    @CrossOrigin
    public void modificarTicketSeveridad(@PathVariable Long cod_severidad,@PathVariable Long codticket) {
        this.service.modificarTicketSeveridad(cod_severidad, codticket);
    }
    
    @PutMapping("/cambiar_estado/{cod_estado}/{codticket}")
    @CrossOrigin
    public void cambiarestado(@PathVariable Long cod_estado, @PathVariable Long codticket){
        this.service.cambiarEstado(cod_estado,codticket);
    }
    
}
