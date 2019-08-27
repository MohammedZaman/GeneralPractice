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
public class Customer extends User {
    
    public Customer(String name, String password){
    super.setDateOfBirth(new Date("06/05/2019"));
    super.setName(name);
    super.setPassword(password);
    }


}
