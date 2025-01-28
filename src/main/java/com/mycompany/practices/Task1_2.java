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
 * TASK 1_2 - Convert Celsius to Fahrenheit
 */

public class Task1_2 {
    
    public Task1_2() {
        
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the input
        System.out.println("Please enter the value of degrees Celsius that you would like to convert to degrees Farenheit:");
        
        //read the value as a double from input
        double celsius = input.nextDouble();
        
        //convert to farenheit
        double farenheit = (9 / 5) * celsius + 32;
        
        //print the results
        System.out.println(celsius + " degrees Celsius is " + farenheit + " degrees Farenheit.");
        
    }
    
    public static void main(String[] args) {
   
       new Task1_2();
   
    }
}
