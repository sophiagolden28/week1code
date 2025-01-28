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
 * Slide 32 Task 4 - Convert a number to binary
 */

public class Slide32_4 {
    
    public Slide32_4() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the number
        System.out.println("Please enter the number you would like to convert to binary: ");
        
        //read the number value as an integer from input
        int number = input.nextInt();
        int placeholder = number;
        
        //a string to hold and build our number in binary
        String binary = "";
        
        //while our number isn't 0, we take the remainder and add it to the binary variable
        //then divide it by 2
        while (number > 0) {
            
            //each time the loop happens, we add the number to the beginning of the binary number
            binary = (number % 2) + binary;
            
            //then split the number in half
            number = number / 2;
            
        }
        
        //display data
        System.out.println(placeholder + " is " + binary + " in binary.");
        
    }
    
    public static void main(String[] args) {
   
       new Slide32_4();
   
    }

}
