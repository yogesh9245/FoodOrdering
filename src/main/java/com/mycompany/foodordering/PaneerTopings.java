/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodordering;

/**
 *
 * @author DELL
 */
public class PaneerTopings extends CustomizePizza {
    
    public PaneerTopings(Pizza p){
        super.p = p;
    }
    @Override
    public String description() {
        return ("Paneer topping is applied");
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pizzaBase() {
        System.out.println("Paneer Modification Pizza base");
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pizzaCheese() {
        System.out.println("Panner cheese");
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double price(){
        super.price();
        return 500;
    }
    
}
