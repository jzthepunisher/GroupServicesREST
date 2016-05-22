/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.compartido;

import com.soloparaapasioandos.capitulo019.Constants;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
public class Userss  {      
    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR)
    public Long UserID;

    @NotNull
    @Size(min = 2, max = 255)
    public String Mail;

    @NotNull
    @Size(min = 2, max = 255)
    public String Password;

    @NotNull
    @Size(min = 2, max = 255)
    public String FirstName;

    @NotNull
    @Size(min = 2, max = 255)
    public String LastName;  
    
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    public Date Birthday = new Date();

    @NotNull
    @Size(min = 2, max = 255)
    public String Cellphone;

    @NotNull
    @Size(min = 2, max = 255)
    public String Code;

    public Userss() {

    }
    
    public Userss(Long UserID,String Mail,String Password,String FirstName,String LastName,Date Birthday,String Cellphone, String Code ) {
        this.UserID=UserID;
        this.Mail=Mail;
        this.Password=Password;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Birthday=Birthday;
        this.Cellphone=Cellphone; 
        this.Code=Code;
    }

    public Long getUserID() {
        return UserID;
    }  

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String Cellphone) {
        this.Cellphone = Cellphone;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    
}
