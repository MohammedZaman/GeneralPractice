/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) {
        
      Programmer programmer = new Programmer();
      System.out.println("----- Inheritance -----");
      System.out.println("The programmer salary is £"+programmer.getSalary());
      System.out.println("The bonus for this year is £"+programmer.getBonus());
      
      
        
    }
}

class Employee{
    private double salary = 150000.0;
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    } 
}

class Programmer extends Employee{
    private double bonus = 2000;
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}