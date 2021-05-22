/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.complexivo.servidesk.models.ticket;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;

/**
 *
 * @author AlexanderGuzman
 */
@Repository
public interface ticketRepository extends JpaRepository<ticket, Long>{
    @Query(value = "SELECT * FROM ticket WHERE cod_tecnico=:codTecnico", nativeQuery = true)
    List<ticket> ticketecnico(Long codTecnico);
    public List<ticket> findByCodticket(Long id);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE ticket set cod_tecnico =?1  where codticket =?2 ")
    void asignarticketTecnico(Long cod_tecnico,Long codticket);
    
    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE ticket SET cod_estado =?1 where codticket =?2")
    void cambiarEstado(Long cod_estado , Long codticket);
    
    
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE ticket SET cod_severidad =?1 WHERE codticket =?2 ")
    void modificarTicketSeveridad(Long cod_severidad,Long codticket);
}
