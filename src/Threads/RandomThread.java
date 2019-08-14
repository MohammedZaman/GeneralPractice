/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohammedzaman
 */
public class RandomThread implements Runnable {

    private String name;
    public RandomThread(String nameOfThread){
    this.name = nameOfThread;
    
    }
    @Override
    public void run() {
       for(int i = 0; i< 7; i++){
       System.out.println("I am "+ name + i );
       }
    }
    
    
}
