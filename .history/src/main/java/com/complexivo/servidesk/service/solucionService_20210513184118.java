package com.complexivo.servidesk.service;

import java.util.List;
import java.util.Optional;

import com.complexivo.servidesk.models.solucion;
import com.complexivo.servidesk.repository.solucionRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class solucionService {

        @Autowired
        private solucionRepository    solucionrepo;
        
        public List<solucion> listar(){
            return this.solucionrepo.findAll();
        }
        public solucion guardar(solucion p){
            return this.solucionrepo.save(p);
        }
        public Optional <solucion> Buscar( Long codsolucion){
            return this.solucionrepo.findByCodsolucion(codsolucion);
        }

        public void Eliminar(Long codsolucion){
            this.solucionrepo.deleteById(codsolucion);
        }
    }
    

