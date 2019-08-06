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

abstract class Employee{
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
  
    public abstract double getWeeklyWage();
}

class Programmer extends Employee{
    private int hoursPerWeek;
    private double payPerHour;
    
    public Programmer(String name ,int hoursPerWeek , double payPerHour){
        this.setName(name);
        this.hoursPerWeek = hoursPerWeek;
        this.payPerHour = payPerHour;
    }

    @Override
    public double getWeeklyWage() {
      return hoursPerWeek * payPerHour * 56;      
    }
}

class Contracter extends Employee{
    private int hoursPerWeek;
    private double payPerHour;
    private int weekLength;
    
    public Contracter(String name ,int hoursPerWeek , double payPerHour,int weekLength){
        this.setName(name);
        this.hoursPerWeek = hoursPerWeek;
        this.payPerHour = payPerHour;
        this.weekLength = weekLength;
        
    }
    @Override
    public double getWeeklyWage() {
       return hoursPerWeek * payPerHour * weekLength;    
    }
}