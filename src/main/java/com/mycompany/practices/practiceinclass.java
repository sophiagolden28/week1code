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
 * 
 * TUESDAY, JANUARY 21
 * 
 * bitwise and = &
 * bitwise or = |
 * bitwise XOR = ^
 * bitwise complement = ~
 * left shift = <<
 * right shift = >>
 * 
 * sout + ctrl + space = system.out.println
 * 
 * ?: is a conditional (ex. : int b = (a == 1) ? 20: 30) (if a is 1, 20 is b, if not 30 is b) (ex. String result = (age >= 18) ? "eligible" : "not eligible)
 *     * test? uif : uif;      
 * 
 * instanceof operator:
 * String name = "James";
 * boolean result = name instanceof String;
 * 
 * in a class start by making all the values like if it were self. in a class in python but just put them there
 * 
 * //MAKE METHODS FOR BEHAVIOURS THIS IS LIKE FUNCTIONS IN PYTHON
 * 
 * to make object: Class name var = new Class name();
 * 
 * to access like the vars inside just do like noah.dorm just like python yayyyyyyyyyyy
 * 
 * using noah.sleep(); is the same as calling a function in python!!
 * 
 * in a normal class DONT ADD A MAIN METHOD, YOU ONLY NEED THE ATTRIBUTES AND THE METHODS
 * 
 * you can also do like Classname.attribute and change it if it's a static variable i think
 * 
 * make a constructor - i already did it accidentally: public Class name () {} - whatever you put in there will happen every time an object is created
 *     like could make a var to keep track of student pop and like then you can increment it every time you make a Studen object
 * 
 * can put like attributes into the () of a class like with python and do that in the constructor JUST LIKE PYTHON then do like noah.name = name etc
 *     just put it in the constructor
 *     then to make it you can do Student sophia = Student(name = "sophia", dorm = "gillette", etc...........) puts it all on one line instead
 *     of constantly making like a line for every attribute
 * 
 * differences betweeen constructor and method: constructor every time, method only when you want, constructor doesn't have private/public etc.....
 * 
 * can we set defaults in the constructor () like in python?
 * 
 * CAN - use "this.attribute =" in the constructor!!!
 * 
 * elif in java is just else if
 * 
 * 
 * SWITCH - switch(expression) {
 *              case value :
 *                  statements
 *                  break;
 * 
 *              case value:
 *                  statements
 *                  break;
 *          }
 * 
 * like switch(dayOfWeek) {
 *          case 1 :
 *              print day is monday!
 *          case 2:
 *              print day is tuesday!
 * 
 *          etc......
 *      }
 *
 * it goes down like an if statement
 * 
 * THURSDAY, JANUARY 23
 * 
 * just set default values by creating variables like int myInt; and then make it later.
 * 
 * loops: while loop and for loop, while is when we don't know the number of times, for is for number of times, just like python.
 * do...while - like a while statement, except that it tests the condition at the end of the loop body - IMPORTANT THAT IT IS THE END NOT THE BEGINNING.
 *
 * int a[] = {1, 2, 3} ARRAY
 * can loop through the array with a for loop:
 * for (int b : a) {
 * 
 *      sout(b);
 * 
 * }
 * 
 * : is "in"
 * 
 * break = stop, continue = skip just like python.
 * 
 * access modifiers:
 *      used to specify and modify the access - how we want to access in the code, four types:
 *              public - in everything
 *              private - only in the class
 *              protected - accessible within the classes and sub-classes and within the packages
 *              default - none just like class car(){} - accessible within the package only
 * 
 * non-access modifiers:
 *      other modifiers that you can add to methods, variables, etc:
 *              static - for creating CLASS methods and variables
 *              final - constant, unchangeable, can't change it ever
 *              synchronized - used for threading
 *              abstract - used abstractly - unclear
 *
 * can add them on to methods classes variables etc.         
 * 
 * Encapsulation:
 *      Something in a capsule with a something enclosed around it.
 *      Basically encapsulating data so that it is protected.
 *      Wrapping data and code together and making it accessible through methods.
 *      Like having to go through security to get to the middle, handling like 
 *          communication between the outside and the inside before it can be accessed.
 *      To achieve it:
 *          Declare the variables of a class as private
 *          Provide public setter and getter methods to modify and view the variables' values
 *              setXXX() and getXXX() methods.
 *                           
 *              Setter = for changing
 * 
 *                 public void setName(string name) {
 *                 
 *                      this.name = name;                 
 *    
 *                 }
 *          
 *              and you access it from outside.
 *              
 *              Getter = always for retrieving
 *                  
 *                  public String getName () {
 *                                   
 *                      return name;
 * 
 *                  }
 *          
 *          So to encapsulate, just private all the variables and then make them changeable + retrievable from outside.
 *          Getters are usually return type(non-void) (like put type first then name), then Setters are void (non-return-type). 
 *          
 *          MAIN USE IS TO CONTROL DATA EXTERNALLY
 * 
 *          HAVE TO MAKE SETTERS AAAAAND GETTERS!!!!!!!!!!!!!!!!!!
 *           
 *          Read-only = only getters
 *          Write-only = only setters
 *          
 *          Very convenient and so you don't have to change things in like a million places 
 *              and can just change it in the setter/getter methods.
 *          
 *          Front end = main program, if you change it in the back end (the one with methods) 
 *              you don't notice anything changing in the front end. 
 * 
 *          Can encapsulate a method by making it private and add another method (public) and 
 *              return the thing by calling the method inside it.
 *              
 *          Mainly just hiding it under a layer like an ONION 
 *              
 *          DO THIS EVERY TIMEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE   
 *          
 *          DEFINE ATTRIBUTES CREATE CONSTRUCTOR.
 * 
 *          Setter: takes attribute, is void, Getter no attributes and is not void, returns something.
 * 
 *          RIGHT CLICK, INSERT CODE, GETTER AND SETTER OMG
 * 
 * 
 * TURN IN CLASS ACTIVITY 2 BEFORE NEXT CLASS and ACTIVITY 3!!
 * 
 * RIGHT CLICK INSERT CODE CONSTRUCTOR MAKE ALL THE PARAMETERS OR ONLY ONEEEEEEEEEEEEEEEEEE YAYYYYY
 * 
 * ANYTHING THAT WE WANT TO SET IS IN THE CONSTRUCTOR BUT INCLUDE ALL THE DEFAULT 
 * VALUES EVERY SINGLE CONSTRUCTOR WITH ONES WE WANT TO BE ABLE TO CHANGE
 * AS LIKE this.age = age AND EVERY OTHER ONE WITH LIKE THE DEFAULT VALUS
 * LIKE this.hair = "brown" JUST KEEP THE DEFAULTS PLS
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/

public class practiceinclass {
    
    public static void main(String[] args) {
   
        System.out.println("This is a file made entirely for notes in class.");
        
        
        
        
        
    }
}
