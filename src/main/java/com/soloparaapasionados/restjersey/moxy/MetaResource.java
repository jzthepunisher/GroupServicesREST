/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.moxy;

import com.soloparaapasioandos.capitulo019.web.dao.ItemDAO;
import com.soloparaapasioandos.capitulo019.web.dao.MetaDAO;
import com.soloparaapasionados.restjersey.compartido.Meta;
import com.soloparaapasionados.restjersey.compartido.MetaResonse;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author USUARIO
 */
@Path("/metaResource")
public class MetaResource {

    @Inject
    MetaDAO metaDAO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/metas")
    public MetaResonse getMetas() {
        MetaResonse metaResonse =new MetaResonse();
        List<Meta> metaList = new ArrayList<>();
        
        //  metaDAO.findAll();
        //if (item == null)
            //throw new WebApplicationException(NOT_FOUND);
        //return item;
        
        //metaList = new ArrayList<>();
        metaList= metaDAO.findAll();
        
        /*metaList.add(new Meta("1", "Comprar Mazda 6", "Deseo adquirir un auto mazda 6 ", "Media", "2015-11-20", "Material"));
        metaList.add(new Meta("2", "Obtener mi título de ingeniería de sistemas", "Ya solo faltan 2 semestres para terminar mi carrera de ingeniería", "Alta", "2016-06-17", "Profesional"));
        metaList.add(new Meta("3", "Conquistar a Natasha", "Natasha es la mujer de vida. Tengo que decírselo antes de que acabe el semestre", "Alta", "2015-05-25", "Espiritual"));
        metaList.add(new Meta("4", "Tener un peso de 70kg", "Actualmente peso 92kg y estoy en sobrepeso. Sin embargo voy a seguir una rutina de ejercicios y un régimen alimenticio", "Baja", "2016-05-13", "Salud"));
        metaList.add(new Meta("5", "Incrementar un 30% mis ingresos", "Conseguiré una fuente de ingresos alternativa que representen un 30% de los ingresos que recibo actualmente.", "Media", "2015-10-13", "Finanzas"));
       */
        metaResonse.estado="1";
        metaResonse.metas=metaList;
        
        return metaResonse;
    }
}
