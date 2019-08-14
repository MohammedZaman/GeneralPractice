/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author mohammedzaman
 */
public class Multiply {
    
    public int times(int a , int b  ){
        return a*b;
    }
    
    public int times(int a){
        return a*a;
    }
    public int times(int a , int b, int c ){
        return a*b*c;
    }
    
}
