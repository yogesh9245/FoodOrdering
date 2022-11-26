/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodordering;

/**
 *
 * @author DELL
 */
public abstract class Pizza {
    String desc = "Welcome to the Pizza House";
    abstract public void pizzaBase();
    abstract public void pizzaCheese();
    public abstract double price();
    public String description(){
        return desc;
    }
}
