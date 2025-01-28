package pakkige.a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sound Room
 */
public class Professor {
    
    private String name;
    private String officeHours;
    private String course;
    private int age;
    
    public void lecture(){
    
        System.out.println("i am lecturing");
    
    }
    
    public void conductOfficeHours(){
    
        System.out.println("i am having office hours");
    
    }
    
    public void grade(){
    
        System.out.println("i am grading");
    
    
    }
    
    public String getCourse (){
    
        return course;
    
    }
    
    public void setCourse (String course){
    
        this.course = course;
    
    }

    
    public String getName (){
    
        return name;
    
    
    }
    
    public void setName (String name){
    
        this.name = name;
    
    
    }
    
    public void setOfficeHours (String officeHours){
        
        this.officeHours = officeHours;
    
    
    }
    
    
    public String getOfficeHours (String officeHours){
    
        return officeHours;
    
    }
    
    
    public int getAge (){
    
        return age;
    
    
    }
    
    public void setAge (int age){
    
        this.age = age;
    
    
    }
    
    
}
