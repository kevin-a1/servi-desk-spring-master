package com.complexivo.servidesk.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prioridad")
public class prioridad  {

    @Id
     private  Long codPrioridad;
     private  String nivelPrioridad;
     private  int tiempoRespuesta;


     
    public prioridad() {
        
    }

    public prioridad(Long codPrioridad, String nivelPrioridad, int tiempoRespuesta) {
        this.codPrioridad = codPrioridad;
        this.nivelPrioridad = nivelPrioridad;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public Long getCodPrioridad() {
        return codPrioridad;
    }

    public void setCodPrioridad(Long codPrioridad) {
        this.codPrioridad = codPrioridad;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(String nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    

}
