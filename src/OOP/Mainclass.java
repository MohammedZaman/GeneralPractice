
package OOP;
/**
 *
 * @author mohammedzaman
 */
public class Mainclass {
    public static void main(String[] args) {
    
        Admin admin = new Admin("Saifuz","Zaman");
        User customer = new Customer("Afzal","Akther");
        User driver = new Driver("Salman","Chowdary");
        
        admin.signIn();
        customer.signIn();
        driver.signIn();
        
        admin.accessDB();
       
        admin.signOut();
        customer.signOut();
        driver.signOut();
     
    }
    
}
