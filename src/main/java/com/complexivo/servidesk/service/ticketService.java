package com.complexivo.servidesk.service;
import com.complexivo.servidesk.models.ticket;
import com.complexivo.servidesk.repository.ticketRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
    
  /*  public ticket editarEstado( Long codTicket, ticket ticket1) {
        if (repo.findById(codTicket).isPresent()) {
            ticket ticketToUpdate=repo.findById(codTicket).get();
            ticketToUpdate.setEstado(ticket1.isEstado());
            return repo.save(ticketToUpdate);			
        }
       return ticket1;
    }*/
    
    public ticket editarFechaAsignacion( Long codTicket, ticket ticket1) {
        if (repo.findById(codTicket).isPresent()) {
            ticket ticketToUpdate=repo.findById(codTicket).get();
            ticketToUpdate.setFechaAsignacion(ticket1.getFechaAsignacion());
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
}