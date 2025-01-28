/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practices;

/**
 *
 * @author Sound Room
 */

/**
 * TASK 3 - Area and perimeter of a rectangle 
 */

public class Task3 {
    public Task3() {

        double width = 4.5;
        double height = 7.9;

        double area = width * height;
        double perimeter = (width * 2) + (height * 2);
            
        System.out.println("The area of the rectangle is " + area + ".");
        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
        
    }
    
    public static void main(String[] args) {
   
       new Task3();
   
    }
}
