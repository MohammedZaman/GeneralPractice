/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;


/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        
        Thread thread = new RandomThread("ThreadY");
        thread.start();
        
        for(int i = 0; i< 7; i++){
        System.out.println("I am Main Thread " + i );
        if(i == 3){
            thread.join();
            System.out.println("Threads Joined");
        }
        }
        
        
      
    }
    
}
