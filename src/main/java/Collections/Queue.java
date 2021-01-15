package Collections;

public class Queue {
    Node front = null;
    Node rear = null;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.nextNode = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if(front == null) {
            return;
        } else{
            Node temp = front;
            front = front.nextNode;
        }
        if(front == null) {
            rear = null;
        }
    }

    public void print() {
        Node temp = front;
        StringBuilder print = new StringBuilder();
        while(temp != null) {
            print.append(temp.value).append(", ");
            temp = temp.nextNode;
        }
        System.out.println(print.toString());
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(9);
        q.print();

    }
}
