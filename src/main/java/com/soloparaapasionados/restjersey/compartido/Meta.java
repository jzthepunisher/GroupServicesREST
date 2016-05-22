/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.compartido;

import com.soloparaapasioandos.capitulo019.Constants;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author USUARIO
 */
@Entity
public class Meta {

    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR)
    public Long idMeta;

    @NotNull
    @Size(min = 2, max = 255)
    public String titulo;

    @NotNull
    @Size(min = 10, max = 4000)
    public String descripcion;
    
    @NotNull
    @Size(min = 2, max = 255)     
    public String prioridad;
    
    @NotNull
    @Size(min = 2, max = 255)
    public String fechaLim;
    
    @NotNull
    @Size(min = 2, max = 255)
    public String categoria;    

    public Meta() {

    }

    public Meta(Long idMeta,
            String titulo,
            String descripcion,
            String fechaLim,
            String categoria,
            String prioridad) {
        this.idMeta = idMeta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLim = fechaLim;
        this.categoria = categoria;
    }

   

    public Long getIdMeta() {
        return idMeta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFechaLim() {
        return fechaLim;
    }

    public void setFechaLim(String fechaLim) {
        this.fechaLim = fechaLim;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
