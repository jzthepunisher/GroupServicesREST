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

public class Flower {

    private int productId;
    private String name;
    private String category;
    private String instructions;
    private double price;
    private String photo;
    public Flower() {
    }
    public Flower(int productId, String name, String category, String instructions, double price, String photo) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.instructions = instructions;
        this.price = price;
        this.photo = photo;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
