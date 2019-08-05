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
public class Animal {
    
    private String animalSound = "sound";
    private double weight = 0.0;
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void displayInfo(){
        System.out.println("my name is " + name +". My animal sound  is " + animalSound + " I weigh " + weight +"kg");
    }
   
    
}
