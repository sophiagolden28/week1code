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
 * TASK 6_2 - Convert Celsius to Fahrenheit
 */

public class Task6_2 {  
    
    public Task6_2() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the number
        System.out.println("Please enter a number: ");
        
        //read the number as an integer from input
        int number = input.nextInt();
        
        //make a placeholder to use later when number is turned into 0
        int placeholder = number;
        
        //create the sum variable 
        int sum = 0;
        
        //while the number isn't 0, we add the last digit to the sum, and divide the number by 10
        while (number > 0) {
            
            sum += number % 10;
            number = number / 10;
            
        }
         
        //display data
        System.out.println("The sum of every digit in " + placeholder + " is " + sum + ".");      
    
    }
 
    public static void main(String[] args) {
   
       new Task6_2();
   
    }   
}
