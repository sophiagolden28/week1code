/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practices;

/**
 *
 * @author Sound Room
 */
public class StudentDriver {
    
    public static void main(String[] args) {
        
        Student noah = new Student("noah", 4.0, 3, "senior", "data science", false, "shen", 0);
        
        noah.dorm = "roth";
        noah.name = "noah austin";
        
        System.out.println(noah.dorm);
        System.out.println(noah.name);
        
        noah.sleep();
        noah.eat();
        
        Student john = new Student("john", 3.2, 6, "junior", "equestrian studies", true, "roth", 2999);
        
        john.name = "john smith";
        john.major = "psychology";
        
        System.out.println(john.name);
        System.out.println(john.major);
        
        john.study();
        john.study();
        john.study();
        john.study();
        john.study();
        
        john.takeExam();
        noah.takeExam();
        
        


    }
    
}
