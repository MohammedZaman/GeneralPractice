/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.stockMechant;

import Threads.*;
import java.util.Arrays;


/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
       int [] arr = {10, 20, 20 ,10, 10, 30, 50, 10, 20};
       findPairs(arr);
       
       
       
     
      
    }
    
    private static void findPairs(int[] arr){
       Arrays.sort(arr);
       int total = 0;
       for(int i = 0; i < arr.length; i++){
       if(i != 0){
       if(arr[i] != -1){
       if(arr[i] == arr[i -1]){
       arr[i] = -1;
       arr[i -1] = -1;
       total++;
       }
       }
       }
       }
       System.out.println(total);
    
    }
    
    
}
