/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Date;

/**
 *
 * @author mohammedzaman
 */
public class User {
    
    //Variables
    private String name;
    private Date dateOfBirth;
    private String password;
    

    // Getters and Setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    // methods 
    public void signIn(){
    System.out.println("Signed in as "+ this.name);
    
    }
    
    public void signOut(){
    System.out.println("Signed Out");
    
    }
    
    
}
