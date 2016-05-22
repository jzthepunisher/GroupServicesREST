package com.soloparaapasioandos.capitulo019.web.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import static com.soloparaapasioandos.capitulo019.Constants.ID_GENERATOR;

@Entity
@Table(name = "USERS")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

    @Id
    @GeneratedValue(generator = ID_GENERATOR)
    @XmlAttribute
    protected Long id;

    @NotNull
    protected String username;

    protected User() {
    }

    public User(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}