package Collections;

import util.Print;

import java.util.LinkedList;
import java.util.List;

public class StacksUsingList {
    List<Integer> data;

    public StacksUsingList() {
        data = new LinkedList<>();
    }

    public void push(int value) {
        data.add(value);
    }

    public int pop() {
        if(data.size() == 0) {
            return -1;
        }

        return data.remove(0);
    }

    public void print() {
        StringBuilder print = new StringBuilder();
        for (Integer value: data) {
            print.append(value).append(", ");
        }
        System.out.println(print.toString());
    }

    public static void main(String[] args) {
        StacksUsingList stack = new StacksUsingList();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.print();
        System.out.println(stack.pop());
        stack.print();
    }
}
