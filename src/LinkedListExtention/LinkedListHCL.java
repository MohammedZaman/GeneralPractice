/*
 *This class is created to excecute the Linked List methods 
 */
package LinkedListExtention;

/**
 *
 * @author mohammedzaman
 */
public class LinkedListHCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(2);
        linkedList.insertSorted(1);
        linkedList.insertSorted(0);
        linkedList.insertSorted(7);
        linkedList.insertSorted(2);
        
        linkedList.reverseList();
 
        
       
        
      
        // dispays sequance with no spaced in bettwen i.e 257
        System.out.print(linkedList.getSequence());
    }
    
}
