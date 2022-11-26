/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodordering;

/**
 *
 * @author DELL
 */
public class Dispatched implements OrderState{

    @Override
    public void showStatus(Order1 order) {
        System.out.println("Your order has been dispatched.Happy meal");
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
