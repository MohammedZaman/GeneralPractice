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
public class ShapeFactory {
    
    public ShapeFactory(){}
    
    public Shape getShape(Shapes shape){
        switch(shape){
            case CIRCLE: 
            return new Circle();
            
            case SQAURE:
            return new Square();
            
            case TRIANGLE:
            return new Triangle();

        }
       return new Shape();
    }
}
