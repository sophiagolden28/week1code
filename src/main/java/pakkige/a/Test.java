package pakkige.a;

import pakkige.a.Professor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sound Room
 */
public class Test {
    
    public static void main(String[] args) {
        
        Professor johnCase = new Professor();
        
        johnCase.lecture();
        johnCase.grade();
        johnCase.conductOfficeHours();
        
        johnCase.setName("Prof. John Case");
        johnCase.setCourse("Theology 209");
        johnCase.setOfficeHours("Monday, 10-11am");
                                                                                                                                          
        johnCase.setAge(900);        
           
        int johnAge = johnCase.getAge();
        
        System.out.println(johnAge);
        
        
        
    }
    
    
}
