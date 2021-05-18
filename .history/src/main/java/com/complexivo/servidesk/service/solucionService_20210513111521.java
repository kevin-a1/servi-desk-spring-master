package com.complexivo.servidesk.service;

import java.util.List;

import com.complexivo.servidesk.models.solucion;
import com.complexivo.servidesk.repository.solucionRepository;
import com.google.common.base.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class solucionService {

        @Autowired
        private solucionRepository    solucionrepo;
        
        public List<solucion> listar(){
            return this.solucionrepo.findAll();
        }
        public solucion nuevo(solucion p){
            return this.solucionrepo.save(p);
        }
        public Optional<solucion> Buscar(Long id){
            return this.solucionrepo.findBycodsolucion(id);
        }
        
        public void ELiminar(Long id){
            this.solucionrepo.deleteById(id);
        }
    }
    
}
