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

public class CarDriver {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 2008, false, 0);
        car.DisplayInfo();
        
        Scanner inputObj = new Scanner(System.in);
        System.out.println("\nWelcome to the CarDriver. What would you like to do?");
        String userInput = inputObj.nextLine();
        
        while (!userInput.equals("quit") && !userInput.equals("Quit")) {
            
            if (userInput.equals("Info") || userInput.equals("info")) {
                
                car.DisplayInfo();
          
            } else if (userInput.equals("Start") || userInput.equals("start")) {
                
                car.Start();
          
            } else if (userInput.equals("Accelerate") || userInput.equals("accelerate")) {
                
                car.Accelerate();
          
            } else if (userInput.equals("Brake") || userInput.equals("brake")) {
                
                car.Brake();
          
            } else if (userInput.equals("Stop") || userInput.equals("stop")) {
                
                car.Stop();
          
            } else {
                
                System.out.println("\n'" + userInput + "' is not a valid action.");
                
            }
            
            System.out.println("\nWhat would you like to do?");
            userInput = inputObj.nextLine();
        
    
        }
        
        
    }
}
