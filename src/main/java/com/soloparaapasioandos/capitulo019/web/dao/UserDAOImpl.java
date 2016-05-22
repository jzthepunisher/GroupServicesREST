package com.soloparaapasioandos.capitulo019.web.dao;

import com.soloparaapasioandos.capitulo019.web.modelo.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class UserDAOImpl
    extends GenericDAOImpl<User, Long>
    implements UserDAO {

    @Inject
    public UserDAOImpl(EntityManager em) {
        super(em, User.class);
    }
}