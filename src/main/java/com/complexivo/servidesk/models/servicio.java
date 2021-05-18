package com.complexivo.servidesk.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "servicio")
public class servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long codServicio;
    
    private String descripcion;
    private String titulo;
    private Date fechaServicio;
    
    @OneToOne
    @JoinColumn(name = "codCatalogo", updatable = false, nullable = false, referencedColumnName = "codCatalogo")
    private catalogo catalogo;

    @OneToOne
    @JoinColumn(name = "codPrioridad", updatable = false, nullable = false, referencedColumnName = "codPrioridad")
    private prioridad prioridad;

    @OneToOne
    @JoinColumn(name = "codTipo", updatable = false, nullable = false, referencedColumnName = "codTipo")
    private tipo tipo;
    
    @OneToOne
    @JoinColumn(name = "codCriticidad", updatable = false, nullable = false, referencedColumnName = "codCriticidad")
    private criticidad criticidad;

    public servicio(Long codServicio, String descripcion, String titulo, Date fechaServicio,catalogo catalogo,
        prioridad prioridad,tipo tipo, criticidad criticidad) {
        this.codServicio = codServicio;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.fechaServicio = fechaServicio;
        this.catalogo = catalogo;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.criticidad = criticidad;
    }
 

    public servicio(String descripcion, String titulo, Date fechaServicio,catalogo catalogo, 
    prioridad prioridad,tipo tipo, criticidad criticidad) {
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.fechaServicio = fechaServicio;
        this.catalogo = catalogo;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.criticidad = criticidad;
    }


    public servicio() {
    }


    public Long getCodServicio() {
        return this.codServicio;
    }

    public void setCodServicio(Long codServicio) {
        this.codServicio = codServicio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Date getFechaServicio() {
        return this.fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public catalogo getCatalogo() {
        return this.catalogo;
    }

    public void setCatalogo(catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public prioridad getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(prioridad prioridad) {
        this.prioridad = prioridad;
    }
    public tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    public criticidad getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(criticidad criticidad) {
        this.criticidad = criticidad;
    }

}

