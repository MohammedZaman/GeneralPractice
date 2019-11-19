/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.RepeatedString;

import Algorithms.stockMechant.*;
import Threads.*;
import java.util.Arrays;


/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
    String testString = "addbdbbdbdbdsaaaaabadssaaaaabbdbdbbdbd";
    System.out.println(repeatedString(testString,1000000000l));
       
       
       
     
      
    }
    
    private static long repeatedString(String s, long n){
    if(n <1000000000){
    String repeated = new String(new char[(int)n]).replace("\0", s);
    String x  = repeated.substring(0,(int)n); 
    int replace = x.length() - x.replace("a", "").length();
    return replace;
    }else{
    long total = 0;
    long AN =  n/100l;
    int nNew =(int)AN;
    for(int i = 0; i < 100; i++){
    String repeatedA = new String(new char[nNew]).replace("\0", s);
    String x1  =  repeatedA.substring(0,nNew); 
    int replace1 = x1.length() - x1.replace("a", "").length();
    System.out.println(replace1);
    total = total + replace1;
    }
    return total;
    }
    }
    
    
}
