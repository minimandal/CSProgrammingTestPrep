package Fall2020;
/**
The next question uses the following class, which implements a linked list:
// Java
class List {
 private class Node {
 int value;
 Node next;
 }

 //refers to the first node
 private Node head;
 public List() {head = null;}
 public void addToFront(int x) {…}
 public void print() {…}
};
2.(2 pts) Define the public member functions addToFront(x) which adds the
value x to the front of the linked list, and print() which displays the contents
of the list to the screen (all on one line, values separated by one space). 
**/

class List {


 private class Node {
 int value;
 Node next;
 }


 //refers to the first node
 private Node head;

 public static void main(String ... args) {
    List list = new List();
    list.addToFront(5);
    list.addToFront(4);
    list.addToFront(3);

    list.print();
 } 

 public List() {head = null;}

 /**
 This method add the new element/ value to the front of the linked list.
 */
 public void addToFront(int x) {
    Node newNode = new Node();
    newNode.value = x;

    if(this.head != null) {   
        newNode.next = this.head;
    }

    this.head = newNode;
 }

 /**
 This method prints the List's content on console as value separated with space.
 */
 public void print() {
    StringBuilder result = new StringBuilder();
    if(this.head == null) {
        result.append("Nothing to print");
    } else{
        Node currNode = this.head;
        while(null != currNode) {
            result.append(currNode.value);
            result.append(" ");
            currNode = currNode.next;
        }
    }
   System.out.println(result.toString());
 }
}