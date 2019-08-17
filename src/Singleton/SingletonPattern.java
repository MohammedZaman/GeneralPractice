/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author mohammedzaman
 */
public class SingletonPattern {
    private static SingletonPattern singleton = null;
    private String x = "hello";
    
    public String getX(){
        return x;
    }
    
    public static SingletonPattern getInstance(){
        if(singleton == null){
            singleton = new SingletonPattern();
            return singleton;
        }else{
            return singleton;
        }
        
    }
    
    
    
}
