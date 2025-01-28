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
 * Slide 32 Task 1 - Display area and perimeter of a rectangle...again...
 */

public class Slide32_1 {
    
    public Slide32_1() {

        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the width of the rectangle
        System.out.println("Please enter the width of the rectangle: ");
        
        //read the width value as a double from input
        double width = input.nextDouble();
        
        //ask for the height of the rectangle
        System.out.println("Please enter the height of the rectangle: ");
        
        //read the height value as a double from input
        double height = input.nextDouble();
        
        double area = width * height;
        double perimeter = (width * 2) + (height * 2);
            
        System.out.println("The area of the rectangle is " + area + ".");
        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
        
    }
    
    public static void main(String[] args) {
   
       new Slide32_1();
   
    }
}
