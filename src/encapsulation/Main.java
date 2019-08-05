/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author mohammedzaman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       House house = new House();
       house.setId(0);
       house.setDoorNum(15);
       house.setHouseName("Harriot House");
       
       System.out.print(house.getDetails());
    }
    
}
