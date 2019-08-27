/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author mohammedzaman
 */
public class Mainclass {
    public static void main(String[] args) {
    
        Admin admin = new Admin("Saifuz","Zaman");
        User customer = new Customer("Afzal","Akther");
        User driver = new Driver("Salman","Chowdary");
        
        admin.signIn();
        customer.signIn();
        driver.signIn();
        
        admin.accessDB();
       
        
        admin.signOut();
        customer.signOut();
        driver.signOut();
     
    }
    
}
