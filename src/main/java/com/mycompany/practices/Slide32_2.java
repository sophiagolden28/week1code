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
 * Slide 32 Task 2 - Get student info
 */

public class Slide32_2 {
    
    public Slide32_2() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the student's name
        System.out.println("Name: ");
        
        //read the name as a string from input
        String name = input.nextLine();
        
        //ask for the student's course
        System.out.println("Course: ");
        
        //read the course as a string from input
        String course = input.nextLine();
        
        //ask for the age
        System.out.println("Age: ");
        
        //read the age as a double from input
        int age = input.nextInt();
    
        //display the data
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
         
    }    
        
    public static void main(String[] args) {
   
       new Slide32_2();
   
    }
}    
