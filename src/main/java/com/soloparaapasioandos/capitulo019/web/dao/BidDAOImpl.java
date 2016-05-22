package com.soloparaapasioandos.capitulo019.web.dao;

import  com.soloparaapasioandos.capitulo019.web.modelo.Bid;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class BidDAOImpl extends GenericDAOImpl<Bid, Long> implements BidDAO {

    @Inject
    public BidDAOImpl(EntityManager em) {
        super(em, Bid.class);
    }
}
