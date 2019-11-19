/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.CountingValleys;

import Algorithms.stockMechant.*;
import Threads.*;
import java.util.Arrays;


/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
   
     String s = "DDUUDDUDUUUD"; 
     System.out.println(countingValleys(s.length(),s));
       
       
       
       
     
      
    }
    
    private static int countingValleys(int n, String s) {
    char[] charValley = s.toCharArray();
    int seaLevel = 0;
    int valley = 0;
    for(int i = 0;i < charValley.length; i++){
    if(charValley[i] == 'U'){
    seaLevel = seaLevel + 1;
    }else if(charValley[i] == 'D'){
    seaLevel = seaLevel - 1;
    }
    if(seaLevel == 0 && charValley[i] == 'U'){
       ++valley;
    }
    
    
    }
    return valley;
    }

    
    
}
