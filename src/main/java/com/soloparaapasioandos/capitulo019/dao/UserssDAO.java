/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasioandos.capitulo019.dao;

import com.soloparaapasioandos.capitulo019.web.dao.GenericDAO;
import com.soloparaapasionados.restjersey.compartido.Userss;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface UserssDAO extends GenericDAO<Userss, Long> {   
    List<Userss> findByIdPassword(String mail,String password);
    String craeteUserss(String UserID,String Mail,String Password,String FirstName,String LastName,String Birthday,String Cellphone,String Code);
}
