package Spring2021;
class Node {
    int value;
    Node next;

    Node(int x) {
        this.value = x;
    }
}

class ListNode {
    Node root;

    public void add(int x) {
        Node newNode = new Node(x);
        if(root == null) {
            root = newNode;
        }else {
            newNode.next = root;
            root = newNode;
        }
    }

    public int findLargest() {
        if(root == null) {
            return 0;
        }

        int largest = 0;

        Node temp = root;
        while(temp != null) {
            if(temp.value > largest) {
                largest = temp.value;
            }
            temp = temp.next;
        }

        return largest;
    }
}
public class LargerNumber {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(0);
        System.out.println(list.findLargest());
    }


}
