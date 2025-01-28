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
 * TASK 3_2 - Convert feet into meters
 */

public class Task3_2 {
    
    public Task3_2() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the number in feet
        System.out.println("Please enter the number in feet: ");
        
        //read the feet value as a double from input
        double feet = input.nextDouble();
        
        //make a meters variable
        double meters = feet * 0.305;
        
        //display data
        System.out.println(feet + " feet is " + meters + " meters.");
        
    }
    
    
    public static void main(String[] args) {
   
       new Task3_2();
   
    }
}
