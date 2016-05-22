/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasioandos.capitulo019.web.dao;


import com.soloparaapasionados.restjersey.compartido.Meta;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author USUARIO
 */
public class MetaDAOImpl extends GenericDAOImpl<Meta, Long>
        implements MetaDAO {

    @Inject
    public MetaDAOImpl(EntityManager em) {
        super(em, Meta.class);
    }
    
}
