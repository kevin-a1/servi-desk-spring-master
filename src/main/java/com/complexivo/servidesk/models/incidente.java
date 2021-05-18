package com.complexivo.servidesk.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="incidente")
public class incidente{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codIncidente;

    @Column(name = "servicioAfectado", nullable = false)
    private String servicioAfectado;

   


    public incidente() {
    }


    public incidente( String servicioAfectado) {
      
        this.servicioAfectado = servicioAfectado;
    }

    public long getCodIncidente() {
        return this.codIncidente;
    }

    public void setCodIncidente(long codIncidente) {
        this.codIncidente = codIncidente;
    }

    public String getServicioAfectado() {
        return this.servicioAfectado;
    }

    public void setServicioAfectado(String servicioAfectado) {
        this.servicioAfectado = servicioAfectado;
    }

}
