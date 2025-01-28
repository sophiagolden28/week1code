/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practices;

/**
 *
 * @author Sound Room
 */

public class Car {
    
    //create default values
    String make;
    int year ;
    boolean engineOn;
    int speed;
    
    int carInventory;
    
    //first constructor - to set default values
    public Car (){
        
        //set default values
        make = "Default make";
        year = 2000;
        engineOn = false;
        speed = 55;
                 
    }
    
    //second constructor - to take parameters
    public Car (String make, int year, boolean engineOn, int speed){
        
        //create default values
        this.make = make;
        this.year = year;
        this.engineOn = engineOn;
        this.speed = speed;          
    
    }
    
    //third constructor - with an added parameter to keep track of inventory
    public Car (String make, int year, boolean engineOn, int speed, int carInventory){
        
        //inventory begins at 0 and increases by one every time a car is created
       //create default values
        this.make = make;
        this.year = year;
        this.engineOn = engineOn;
        this.speed = speed;      
        this.carInventory = 0;
        carInventory += 1;
        
    }
    
    //info displaying method
    void DisplayInfo (){ 
    
        System.out.println("\nMake: " + make);
        System.out.println("Year: " + year);
        
        //set up a conditonal to display whether the engine is on or not instead of true or false
        if (engineOn == true) {
            
            System.out.println("Engine Status: On");
        
        } else {
            
            System.out.println("Engine Status: Off");
        
        }
        
        System.out.println("Speed: " + speed);
        System.out.println("Car Inventory Number: " + carInventory);
    
    
    }
    
    //start method
    void Start(){
        
        if (engineOn != true) {
        
            engineOn = true;
            System.out.println("\nThe engine is on.");
            
        } else {
            
            System.out.println("\nThe car's engine is already on.");
    
        }
        
    }
    
    //accelerate method
    void Accelerate(){
    
        //if the engine is on, increase the speed, but if not, tell the user
        if (engineOn == true) {
        
            speed += 50;
            System.out.println("\nThe car's speed is now " + speed);
            
        } else {
        
            System.out.println("\nHow can the car accelerate when the engine is not on?");
            
        }
        
    }
    
    //brake method
    void Brake(){
    
        //if the engine is on, decrease the speed, but if not, tell the user
        if (engineOn == true) {
        
            speed -= 25;
            System.out.println("\nThe car's speed is now " + speed);
            
        } else {
        
            System.out.println("\nHow can the car decelerate when the engine is not on?");
            
        }
    
    }
    
    //stop method
    void Stop(){
    
        //if the speed is 0, turn off the engine, but if not, tell the user
        if (speed <= 0) {
        
            engineOn = false;
            System.out.println("\nThe engine is now off.");
            
        } else {
        
            System.out.println("\nSpeed must be 0 in order to stop the car.");
            
        }
    
    }
    
    
    
}
