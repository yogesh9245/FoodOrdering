/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.foodordering;

import java.util.Scanner;

/**
 *
 * @author Yogesh
 */
public class FoodOrdering {

    public static void main(String[] args) {
        Order1 order = new Order1();
        Orders o;
        Pizza p;
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Most advanced Food ordering system");
        String customize;
        while(choice!=0){
            System.out.println("1.Cheese Pizza With Plain dosa \n2.Veggie Pizza With Masala Dosa");
            System.out.println("3.Pepperoni Pizza With Moong Dal dosa \n4.Margherita Pizza With Rava Dosa");
            System.out.println("Please Choose the combo");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    order = new Order1();
                    order.showstatus();
                    order.setState(new CookingDone());
                    order.showstatus();
                    order.setState(new ReadyForDispatch());
//                    order.showstatus();
//                    order.setState(new Dispatched());
//                    order.showstatus();
                    break;
                case 2:
                    o = new Order2();
                    o.getPizza().description();
                    o.getPizza().pizzaCheese();
                    o.getPizza().pizzaBase();
                    o.getDosa().batter();
                    o.getDosa().stuffing();
                    break;
                case 3:
                    o = new Order3();
                    o.getPizza().description();
                    o.getPizza().pizzaCheese();
                    o.getPizza().pizzaBase();
                    o.getDosa().batter();
                    o.getDosa().stuffing();
                    break;
                case 4:
                    o = new Order4();
                    o.getPizza().description();
                    o.getPizza().pizzaCheese();
                    o.getPizza().pizzaBase();
                    o.getDosa().batter();
                    o.getDosa().stuffing();
                    break;
                case 0:
                    break;
            }
            System.out.println("Do you want to add some topings ?");
            customize = sc.next();
            if(customize.equals("yes")){
                p = new PaneerTopings(order.getPizza());
                System.out.println(p.description());
                System.out.println(p.price());
            }
            System.out.println("Do you still want to continue with more orders?");
            System.out.println("Enter 1 for yes, 0 for no");
            choice = sc.nextInt();
            if(choice==0){
                order.showstatus();
                order.setState(new Dispatched());
                order.showstatus();
                break;
            } 
        }
//        Orders order;
//        Order1 o1 = new Order1();
//        Pizza pizza;
//        order = new Order1();
//        o1.showstatus();
//        o1.setState(new ReadyForDispatch());
//        o1.showstatus();
//        order.getDosa().batter();
//        pizza = new PaneerTopings(new CheesePizza());
//        System.out.println(pizza.description());
//        System.out.println(pizza.price());
//        order.getPizza().pizzaBase();
//        order = new Order3();
//        order.getDosa().batter();
//        order.getPizza().pizzaBase();
    }
}
