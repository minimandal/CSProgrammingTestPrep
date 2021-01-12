package Spring2020;

/**
 * Lookup: https://cs.txstate.edu/media/uploads/files/programming-Spring-2020.pdf
 * 4. (4 pts) Declare and implement a class to represent a stack of integers, called
 * IntStack. Include the following functions in your class:
 * • a default constructor that creates an empty stack.
 * • a void function for push(x) that inserts a new value onto the top of the
 * stack.
 * • an int function for pop() that removes the value from the top of the stack,
 * and returns it (if the stack is empty, it returns -1).
 * • a boolean function isempty() that returns true if the stack is empty,
 * otherwise false.
 * Note that a stack adds and removes elements in “Last In, First Out” order. The
 * most recently added element is the one that is removed next.
 * Implement the class functions using a linked list composed of Nodes to store
 * the values in the stack. Hint: push(x) should add x to the front of the list and
 * pop should remove the element at the front of the list. Use the following
 * declarations in your class:
 */

class Node {
    int value;
    Node next;
}
public class IntStack {

    Node head;
    /**
     * Default Constructor
     */
    public IntStack() {
        head = new Node();
    }

    public void push(int x) {
        Node newNode = new Node();
        newNode.value = x;
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {
        if(head == null) {
            return -1;
        } else {
            int temp = head.value;
            head = head.next;
            return temp;
        }
    }

    public boolean isEmpty() {
       return head == null;
    }
}
