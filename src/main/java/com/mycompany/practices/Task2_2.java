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
 * TASK 2_2 - Compute the volume of a cylinder
 */

public class Task2_2 {
    
    public Task2_2(){
        
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the radius
        System.out.println("Please enter the radius of your cylinder: ");
        
        //read the radius value as a double from input
        double radius = input.nextDouble();
        
        //ask for the length
        System.out.println("Please enter the length of your cylinder: ");
        
        //read the length value as a double from input
        double length = input.nextDouble();
        
        //set up the area and volume variables
        double area = radius * radius * 3.14159;
        double volume = area * length;
    
        //output the results
        System.out.println("The area of your cylinder is " + area);
        System.out.println("The volume of your cylinder is " + volume);
    }
    
    public static void main(String[] args) {
    
        new Task2_2();
    
    }
}
