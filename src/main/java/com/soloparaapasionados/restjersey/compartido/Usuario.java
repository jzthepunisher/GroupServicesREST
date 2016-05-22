/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.compartido;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */

public class Usuario {

    private int id;
    private String name;

    public Usuario() {
    }

    public Usuario(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Usuario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
