/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.compartido;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public class MetaResonse {
    public String estado;
    public List<Meta> metas;

       public MetaResonse(){
    
    }        
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }

   
 
}
