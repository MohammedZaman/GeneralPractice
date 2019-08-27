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
    
    public Shape getShape(enum shape){
        switch(shape){
            case: Shapes.CIRCLE;
            return new Circle();
            break;
            case: Shapes.SQAURE;
            return new Square();
            case: Shapes.TRIANGLE;
            return new Triangle();
        }
       return new Shape();
    }
    }
