/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practices;

import static java.lang.StrictMath.tan;
import java.util.Scanner;

/**
 *
 * @author Sound Room
 */

/**
 * Slide 32 Task 3 - Compute the area of a polygon
 */

public class Slide32_3 {
    
    public Slide32_3() {

        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the number of sides
        System.out.println("Please enter the number of sides: ");
        
        //read the number of sides as an integer from input
        int n = input.nextInt();
        
        //ask for the length of a side
        System.out.println("Please enter the length of a side: ");
        
        //read the length of a side as an integer from input
        int s = input.nextInt();
        
        double area = (n*s^2)/(4*tan(3.14159/n));
        
        System.out.println("The area of the polygon is " + area + ".");
        
    }
    
    public static void main(String[] args) {
   
        new Slide32_3();
   
    }
}
