package Collections;

class Node {
    int value;
    Node nextNode;
    Node(int value) {
        this.value = value;
    }
}
public class LinkedList {
    Node root;

    public void add(int data) {
        Node newNode = new Node(data);
        if(root == null) {
            root = newNode;
        } else {
            newNode.nextNode = root;
            root = newNode;
        }
    }

    public int remove(int data) {
        if(root == null) {
            throw new IllegalStateException("List is empty");
        } else {
            Node current = root;
            Node prevNode = null;

            // If Root is the value
            if(current.value == data) {
                root = root.nextNode;
                return current.value;
            }

            //
            while(current != null && current.value != data) {
                prevNode = current;
                current = current.nextNode;
            }

            if(current == null) {
                throw new IllegalStateException("There is not key");
            }

            prevNode.nextNode = current.nextNode;
            return current.value;
         }
    }

    public void printList() {
        if(root == null) {
            System.out.println("Root is Empty");
        } else {
            StringBuilder print = new StringBuilder();
            Node temp = root;
            while(temp != null) {
                print.append(temp.value).append(", ");
                temp = temp.nextNode;
            }
            System.out.println(print.toString());
        }
    }
}

class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.printList();

        list.remove(6);
        list.printList();
    }
}