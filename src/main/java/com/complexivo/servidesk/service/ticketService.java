package com.complexivo.servidesk.service;
import com.complexivo.servidesk.models.ticket;
import com.complexivo.servidesk.repository.ticketRepository;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Service
public class ticketService {
    @Autowired
    private ticketRepository repo;

    public ticket crearTicket(ticket ticket){
        return repo.save(ticket);
    }
    public List<ticket> listarTodo() {
        return this.repo.findAll();
    }
    public void eliminar( Long codTicket) {
        this.repo.deleteById(codTicket);
    }
    
    public List<ticket> tickeTecnico(Long codTecnico){
        return this.repo.ticketecnico(codTecnico);
    }

    public List<ticket> ticketUsuario(Long codUsuario){
        return this.repo.ticketUsuario(codUsuario);
    }
    
  /*  public ticket editarEstado( Long codTicket, ticket ticket1) {
        if (repo.findById(codTicket).isPresent()) {
            ticket ticketToUpdate=repo.findById(codTicket).get();
            ticketToUpdate.setEstado(ticket1.isEstado());
            return repo.save(ticketToUpdate);			
        }
       return ticket1;
    }*/
    
    public ticket editarFechaAsignacion( Long codTicket, ticket ticket1) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+ dtf.format(LocalDateTime.now()));
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(dtf.format(LocalDateTime.now()));
        } catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        if (repo.findById(codTicket).isPresent()) {
            ticket ticketToUpdate=repo.findById(codTicket).get();
            ticketToUpdate.setFechaAsignacion(fechaDate);
            return repo.save(ticketToUpdate);		
        }
       return ticket1;
    }
    public List<ticket> getTicketByID( Long codTicket) {
       return this.repo.findByCodticket(codTicket);
 
    }
    public void asignarTecnicoTicket(Long cod_tecnico,Long codticket){
        this.repo.asignarticketTecnico(cod_tecnico, codticket);
    }
    public void modificarTicketSeveridad(Long cod_severidad, Long codticket){
       this.repo.modificarTicketSeveridad(cod_severidad, codticket);
    }
    
    public void cambiarEstado(Long cod_estado, Long codticket){
        this.repo.cambiarEstado(cod_estado, codticket);
    }
}