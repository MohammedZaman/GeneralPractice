/*
 *This is the signly linked Linked List used to store numbers.
 *
 */
package LinkedListExtention;

/**
 *
 * @author mohammedzaman
 */
public class CustomLinkedList {

    Node head;

    /**
     * This constructor creates the linked list with no nodes
     */
    public CustomLinkedList() {
    }

    /**
     * This constructor creates a new linked list with one node
     *
     * @param data the integer to be stored
     */
    public CustomLinkedList(int data) {
        head = new Node(data);
    }

    /**
     * The new node is sorted in ascending order
     *
     * @param data the integer to be stored
     */
    public void insertSorted(int data) {
        Node newNode = new Node(data);

        if (head == null || newNode.data <= head.data) {

            newNode.next = head;
            head = newNode;

        } else {
            Node currentNode = head;
            while (currentNode.next != null && currentNode.next.data < newNode.data) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    /**
     * Counts all the elements in the Linked List
     *
     * @return the size of the linked list
     */
    public int getSize() {
        Node currentNode = head;
        int i = 0;
        while (currentNode != null) {
            i++;
            currentNode = currentNode.next;
        }
        return i;
    }

    /**
     * delete node with value
     *
     * @param data value to be deleted
     */
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * Deleting a node based on index
     *
     * @param index the position where the node
     */
    public void deleteAt(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
        }
        Node currentNode = head;
        int i = 0;
        while (currentNode.next != null) {
            i++;
            if (i == index) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * Reversing a Linked list 
     */
    public void reverseList() {
        Node currentNode = head;
        Node nextNode = null;
        Node prevNode = null;
       
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode; 
            prevNode = currentNode;
            currentNode = nextNode;
        
        }
        head = prevNode;
    }

    /**
     * Display all node data values
     *
     * @return the order of the list
     */
    public String getSequence() {
        Node currentNode = head;
        String order = "";
        while (currentNode != null) {
            order += currentNode.data + " ";
            currentNode = currentNode.next;

        }
        return (order);
    }

}
