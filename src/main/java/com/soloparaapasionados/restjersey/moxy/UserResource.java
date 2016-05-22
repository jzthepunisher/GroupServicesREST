/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.moxy;

import com.soloparaapasioandos.capitulo019.dao.UserssDAO;
import com.soloparaapasioandos.capitulo019.web.dao.MetaDAO;
import com.soloparaapasionados.restjersey.compartido.Meta;
import com.soloparaapasionados.restjersey.compartido.Userss;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author USUARIO
 */
@Path("/userss")
public class UserResource {

    @Inject
    UserssDAO userssDAO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{mail}/{password}")
    public List<Userss> getUserByIdPassword(@PathParam("mail") String mail, @PathParam("password") String password) {
        List<Userss> metaList = new ArrayList<>();

        metaList = userssDAO.findByIdPassword(mail, password);

        return metaList;
    }

    @Transactional
    @POST
    @Path("/{UserID}/{Mail}/{Password}/{FirstName}/{LastName}/{Birthday}/{Cellphone}/{Code}")
    public String postUser(@PathParam("UserID") String UserID, @PathParam("Mail") String Mail,
            @PathParam("Password") String Password, @PathParam("FirstName") String FirstName,
            @PathParam("LastName") String LastName, @PathParam("Birthday") String Birthday,
            @PathParam("Cellphone") String Cellphone, @PathParam("Code") String Code
    ) {
        //http://localhost:8080/Capitulo019/v1/userss/20/qqqqq/3333/uuuuu/ttttt/1986-10-12/rrrr/iiii
        //state = userssDAO.craeteUserss(UserID, Mail, Password, FirstName, LastName, Birthday, Cellphone, Code);

        Userss userss = new Userss();
        userss.Birthday = Date.valueOf(Birthday);
        userss.UserID = Long.valueOf(UserID);
        userss.Mail = Mail;
        userss.Password = Password;
        userss.FirstName = FirstName;
        userss.LastName = LastName;
        userss.Cellphone = Cellphone;
        userss.Code = Code;

        userssDAO.joinTransaction();
        userssDAO.makePersistent(userss);

        return "ok";
    }

    @Transactional
    @PUT
    @Path("/{UserID}/{Mail}/{Password}/{FirstName}/{LastName}/{Birthday}/{Cellphone}/{Code}")
    public String putUser(@PathParam("UserID") String UserID, @PathParam("Mail") String Mail,
            @PathParam("Password") String Password, @PathParam("FirstName") String FirstName,
            @PathParam("LastName") String LastName, @PathParam("Birthday") String Birthday,
            @PathParam("Cellphone") String Cellphone, @PathParam("Code") String Code
    ) {
        //String state = "";
        //state = userssDAO.craeteUserss(UserID, Mail, Password, FirstName, LastName, Birthday, Cellphone, Code);

        Userss userss = new Userss();
        userss.Birthday = Date.valueOf(Birthday);
        userss.UserID = Long.valueOf(UserID);
        userss.Mail = Mail;
        userss.Password = Password;
        userss.FirstName = FirstName;
        userss.LastName = LastName;
        userss.Cellphone = Cellphone;
        userss.Code = Code;

        userssDAO.joinTransaction();
        userssDAO.makePersistent(userss);

        return "ok";
    }

    @Transactional
    @DELETE
    @Path("/{UserID}")
    public String deleteUser(@PathParam("UserID") String UserID) {
        String state = "ok";
        //state = userssDAO.craeteUserss(UserID, Mail, Password, FirstName, LastName, Birthday, Cellphone, Code);

        Userss userss = userssDAO.findById(Long.valueOf(UserID));

        if (userss != null) {
            userssDAO.joinTransaction();
            userssDAO.makeTransient(userss);
            state= "no existe";
        }
        return state;
    }
}
