/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphsim;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) {
    
        List<Animal> animals = new ArrayList<>();
        
        Animal cat = new Cat();
        cat.setAnimalSound("meow meow");
        cat.setName("fluffy");
        cat.setWeight(0.9);
        
        Animal dog = new Dog();
        dog.setAnimalSound("woof woof");
        dog.setName("doggy");
        dog.setWeight(2.5);
        
        
        Animal dog1 = new Dog();
        dog1.setAnimalSound("woof woof");
        dog1.setName("Snoop");
        dog1.setWeight(2.1);
        
        Animal cat1 = new Cat();
        cat1.setAnimalSound("meow meow");
        cat1.setName("Garfield");
        cat1.setWeight(01.5);
        
        animals.add(cat);
        animals.add(dog);
        animals.add(dog1);
        animals.add(cat1);
        
        animals.forEach((animal) -> {
            animal.displayInfo();
        });
        
        
        
        

        
        
        
        
        
        
       
      
        
        
        
    }
    
}
