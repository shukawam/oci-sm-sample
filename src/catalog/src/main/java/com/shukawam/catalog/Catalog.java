/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.shukawam.catalog;

/**
 *
 * @author shukawam
 */
public class Catalog {
    public int id;
    public String color;
    public Department department;
    public String name;
    public double price;
    public String imageUrl;

    public Catalog() {
    }

    public Catalog(int id, String color, Department department, String name, double price) {
        this.id = id;
        this.color = color;
        this.department = department;
        this.name = name;
        this.price = price;
    }

    public Catalog(int id, String color, Department department, String name, double price, String imageUrl) {
        this.id = id;
        this.color = color;
        this.department = department;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

}
