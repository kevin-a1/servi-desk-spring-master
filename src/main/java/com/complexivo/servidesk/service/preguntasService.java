/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.models.preguntas;
import com.complexivo.servidesk.repository.preguntasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class preguntasService {
    @Autowired
    private preguntasRepository pregunRepository;
    
    public List<preguntas> Listar(){
        return this.pregunRepository.findAll();
    }
    
    public preguntas Nuevo(preguntas preguntas){
        return this.pregunRepository.save(preguntas);
    }
    
    public Optional<preguntas> Buscar(Long id){
        return this.pregunRepository.findByCodPregunta(id);
    }
    
    public void Eliminar(Long id){
        this.pregunRepository.deleteById(id);
    }
}
