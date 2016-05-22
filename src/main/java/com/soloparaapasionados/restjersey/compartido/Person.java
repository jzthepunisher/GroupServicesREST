/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.compartido;

/**
 *
 * @author USUARIO
 */
public class Person  {
    public String firstName;
    public String lastName;
    public String pictureUrl;
    public String shortBio;

    public Person(){
        
    }
    public Person(String firstName, String lastName, String pictureUrl, String shortBio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pictureUrl = pictureUrl;
        this.shortBio = shortBio;
    }
}