/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasioandos.capitulo019.dao;

import com.soloparaapasioandos.capitulo019.web.dao.GenericDAOImpl;
import com.soloparaapasionados.restjersey.compartido.Userss;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author USUARIO
 */
public class UserssDAOImpl extends GenericDAOImpl<Userss, Long>
        implements UserssDAO {

    @Inject
    public UserssDAOImpl(EntityManager em) {
        super(em, Userss.class);
    }

    @Override
    public List<Userss> findByIdPassword(String mail, String password) {
        Query query = em.createNativeQuery("select * from Userss where Mail=? and Password=?", Userss.class);
        query.setParameter(1, mail);
        query.setParameter(2, password);

        List<Userss> result = query.getResultList();
        return result;
    }
    
 @Override
    public String craeteUserss(String UserID, String Mail, String Password, String FirstName, String LastName, String Birthday, String Cellphone, String Code) {
        Query query = em.createNativeQuery("insert into Userss (UserID, Mail, Password, FirstName, LastName, Birthday, Cellphone, Code) "
                + " values (?,?,?,?,?,?,?,?)");
        query.setParameter(1, UserID);
        query.setParameter(2, Mail);
        query.setParameter(3, Password);
        query.setParameter(4, FirstName);
        query.setParameter(5, LastName);
        query.setParameter(6, Birthday);
        query.setParameter(7, Cellphone);
        query.setParameter(8, Code);

       query.executeUpdate();
       
       
        return "ok";
    }

}
