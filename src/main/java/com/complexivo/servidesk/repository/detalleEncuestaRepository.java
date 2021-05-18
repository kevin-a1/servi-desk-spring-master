/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.detalleEncuesta;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface detalleEncuestaRepository extends JpaRepository<detalleEncuesta, Long>{
    public Optional<detalleEncuesta> findByCodDetalle(Long id);
    
}
