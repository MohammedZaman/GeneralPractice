/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author mohammedzaman
 */
public class mainMethod {
    
    public static void main(String[] args) {
      ShapeFactory shapeF = new ShapeFactory();
      
      Shape T = shapeF.getShape(Shapes.TRIANGLE);
      Shape S = shapeF.getShape(Shapes.SQAURE);
      Shape C = shapeF.getShape(Shapes.CIRCLE);
     

      
      if(T instanceof Triangle){
           System.out.println("Triangle");   
      }
      if(S instanceof Square){
           System.out.println("Square");
      }
      if(C instanceof Circle){
           System.out.println("Circle");
      }
      
    }

}
