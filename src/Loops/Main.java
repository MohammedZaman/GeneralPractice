/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author mohammedzaman
 */
public class Main {
    public static void main(String[] args) {
        forLoops();
        nestedLoops();
        forEachLoop();
        whileLoop();
        doWhile();
         
    }
    
    
    
    
    private static void doWhile(){
        int i = 0;
        do{
        System.out.print("$");
        i++;
        }while(i < 5);
    }
    
    private static void whileLoop(){
    int  i = 0;    
    while(i < 5){
    System.out.print("X");
    i++;
    }
    }
    
    
    private static void forEachLoop(){
    
    int [] graph = new int[5];
  
   
    for(int i = 0; i < graph.length;i++){
        graph[i] = 5;
    }
    
    
    for(int cell: graph){
        System.out.println(cell);
    }
    
    }
    
    
    private static void nestedLoops(){  
      int[][] graph = new int[5][5]; 
    
      for(int i = 0 ; i < graph.length; i++){
        for(int j = 0; j < graph.length;j++){
            graph[i][j] = 1;
        }
      }
      for(int i = 0 ; i < graph.length; i++){
        System.out.println(System.lineSeparator());
        for(int j = 0; j < graph.length;j++){
            System.out.print(graph[i][j]);
        }
      }
    }
    
    
    private static void forLoops(){   
      System.out.println("Standard for Loop");  
      for(int i = 0; i< 10; i++){
             System.out.println("hello " + (i+1));
      }
      
      System.out.println("for Loop with break ");  
      for(int i = 0; i < 10; ++i){
             if(i == 4){
                 break;
             }
             System.out.println("hello " + (i+1));
             
      }
      
      System.out.println("for loop with continue  ");       
      for(int i = 0; i < 10; ++i){
             if(i == 3){
                 continue;
             }else{
                 System.out.println("hello " + (i+1));
             }
      } 
    }
    
    
    
}


