/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import OOP.Interfaces.DatabaseAcess;
import java.util.Date;

/**
 *
 * @author mohammedzaman
 */
public class Admin extends User implements DatabaseAcess {
    
    public Admin(String name, String password){
    super.setDateOfBirth(new Date("06/05/2019"));
    super.setName(name);
    super.setPassword(password);
    }
   
    @Override
    public void signIn(){
    System.out.println("Welcome Admin " + super.getName());    
    }

    @Override
    public void accessDB() {
        System.out.println("you have accessed the database");
    }
    
}
