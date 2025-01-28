/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practices;

import java.util.Scanner;

/**
 *
 * @author Sound Room
 */

/**
 * TASK 5_2 - Financial application: calculate tips
 */

public class Task5_2 {
    
    public Task5_2() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the subtotal
        System.out.println("Please enter the subtotal: ");
        
        //read the subtotal as a double from input
        double subtotal = input.nextDouble();
        
        //ask for the gratuity
        System.out.println("Please enter the gratuity rate: ");
        
        //read the gratuity as a double from input
        double gratuity = input.nextDouble();
        
        //make a tip variable
        double tip = subtotal * (gratuity / 100);
        
        //make a total cost variable
        double total = subtotal + tip;
        
        //display data
        System.out.println("Tip is $" + tip + ", making the total cost $" + total + ".");
        
    }
 
    public static void main(String[] args) {
   
       new Task5_2();
   
    }

}
