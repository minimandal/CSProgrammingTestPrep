package Collections;

public class Stacks {
    static final int capacity = 1000;
    int array[] = new int[capacity];
    int top = -1;

    public Stacks() {
        top = -1;
    }

    public void push(int value) {
        if(top >= capacity - 1) {
            throw new IllegalStateException("Stackoverflow Exception");
        } else {
            array[++top] = value;
            return;
        }
    }

    public int pop() {
        if(top < 0) {
            throw new IllegalStateException("Stack is Empty");
        } else {
            int result = array[top--];
            return result;
        }
    }
    public void print() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            result.append(array[i]).append(", ");
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        stacks.push(4);
        stacks.push(4);
        stacks.push(4);
        stacks.print();
        stacks.push(5);
        stacks.push(8);
        stacks.push(42);
        stacks.push(49);
        stacks.print();
        System.out.println(stacks.pop());
    }
}
