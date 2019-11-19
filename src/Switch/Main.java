/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import static java.lang.System.out;
import overloading.*;

/**
 *
 * @author mohammedzaman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num=4;
     switch(num+2)
     {
        case 1:
	  System.out.println("Case1: Value is: "+num);
	case 2:
	  System.out.println("Case2: Value is: "+num);
	case 3:
	  System.out.println("Case3: Value is: "+num);
        default:
	  System.out.println("Default: Value is: "+num);
      }


   

    }
    
}
