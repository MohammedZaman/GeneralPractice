/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphsim;

/**
 *
 * @author mohammedzaman
 */
public class Cat extends Animal {
   @Override
    public void displayInfo(){
        System.out.println("I am " + super.getName() +". My animal sound  is " + super.getAnimalSound() + " I weigh " + 5 * super.getWeight() +"kg");
    }
    
    
    
    
   
   
   
}
