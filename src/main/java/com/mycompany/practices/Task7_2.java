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
 * TASK 7_2 - Convert Celsius to Fahrenheit
 */

public class Task7_2 {
    
    public Task7_2() {
    
        //make the scanner object
        Scanner input = new Scanner(System.in);
        
        //ask for the number of minutes
        System.out.println("Please enter the number of minutes: ");
        
        //read the minutes value as a double from input
        double minutes = input.nextDouble();
        
        //make a hours variable
        double hours = minutes / 60;
        
        //make a days variable
        double days = hours / 24;
        
        //make a years variable
        double years = days / 365;
        
        //make a days left over variable
        double daysLeftOver = days % 365;
        
        //convert to integer so it looks nice
        int intMinutes = (int) minutes;
        int intYears = (int) years;
        int intDaysLeftOver = (int) daysLeftOver;
        
        //catch the days if there isn't a full year
        if (days < 365){
            
            intDaysLeftOver = (int) days;
        
        }
        
        
        //display data
        System.out.println(intMinutes + " minutes is approximately " + intYears + " years and " + intDaysLeftOver + " days.");
        
    }
    
    public static void main(String[] args) {
   
       new Task7_2();
   
    }

}
