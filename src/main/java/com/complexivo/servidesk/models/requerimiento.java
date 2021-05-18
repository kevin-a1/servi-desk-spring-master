package com.complexivo.servidesk.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requerimiento")
public class requerimiento{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codRequerimiento;

    @Column(name = "eventoPresentado", nullable = false)
    private String eventoPresentado;


    public requerimiento() {
    }


    public requerimiento(long codRequerimiento, String eventoPresentado) {
        this.codRequerimiento = codRequerimiento;
        this.eventoPresentado = eventoPresentado;
    }
     
    public requerimiento( String eventoPresentado) {
       
        this.eventoPresentado = eventoPresentado;
    }

    public long getCodRequerimiento() {
        return this.codRequerimiento;
    }

    public void setCodRequerimiento(long codRequerimiento) {
        this.codRequerimiento = codRequerimiento;
    }

    public String getEventoPresentado() {
        return this.eventoPresentado;
    }

    public void setEventoPresentado(String eventoPresentado) {
        this.eventoPresentado = eventoPresentado;
    }


}
