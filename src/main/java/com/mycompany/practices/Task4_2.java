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
 * TASK 4_2 - Convert Pounds to Kilograms
 */

public class Task4_2 {
    
    public Task4_2() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the number in pounds
        System.out.println("Please enter the number in pounds: ");
        
        //read the feet value as a double from input
        double pounds = input.nextDouble();
        
        //make a kilograms variable
        double kilograms = pounds * 0.454;
        
        //display data
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
        
    }
    
    
    public static void main(String[] args) {
   
       new Task4_2();
   
    }

}
