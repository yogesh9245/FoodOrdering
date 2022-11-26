/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodordering;

/**
 *
 * @author DELL
 */
public class Order1 implements Orders{
    OrderState orderstate;
    public Order1(){
        orderstate = new JustOrdered();
    }
    
    public void setState(OrderState orderstate){
        this.orderstate = orderstate;
    }
    
    public OrderState getstate(){
        return orderstate;
    }
    @Override
    public Dosa getDosa() {
        return new PlainDosa();
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pizza getPizza() {   
        return new CheesePizza();
    }
    
    public void showstatus(){
        orderstate.showStatus(this);
        System.out.println("Following is the status of your order");
    }
}
