/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodordering;

/**
 *
 * @author DELL
 */
public abstract class CustomizePizza extends Pizza{
    Pizza p;
    @Override
    public abstract String description();
    @Override
    public double price(){
        return p.price();
    }
}
