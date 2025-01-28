/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practices;

/**
 *
 * @author Sound Room
 */
public class Student {
    
    int studentPopulation;
    
    String name;
    double gpa;
    int numberOfClassesTaking;
    String year;
    String major;
    boolean isAthlete;
    String dorm;
    
    int hoursStudied;
    
    //100 is full, 0 is hungry
    int eatingStrength;
    
    //MAKE METHODS FOR BEHAVIOURS THIS IS LIKE FUNCTIONS IN PYTHON with void and not void!!!!
    
    
    public Student(String name, double gpa, int numberOfClassesTaking, String year, String major, boolean isAthlete, String dorm, int hoursStudied) {
    
        System.out.println("new object created!");
        
    
    }
    
    
    void study(){
        
        System.out.println(name + " is studying");
        
        hoursStudied+=2;
    
    }
    
    void takeNotes(){
        
        System.out.println(name + " is taking notes");
        
    }
    
    void changeMajor(){
    
        System.out.println(name + " is changing majors");
    
    
    }
    
    void attendClass(){
    
        System.out.println(name + " is in class");
        
    }
    
    void sleep(){
        
        System.out.println(name + " is sleeping");
    
    }
    
    
    void eat(){
    
        System.out.println(name + " is eating");
    }
    
    void takeExam (){
        
        if (hoursStudied >= 5) {
        
            System.out.println(name + " passed the exam!!!!!!!!!!1");
        
        } else {
        
            System.out.println(name + " failed the exam");
        
        
        }
        
        
    
        
    }
    
    void populationCount(){
    
        System.out.println("the population of students is " + studentPopulation);
    
    }
    
}
