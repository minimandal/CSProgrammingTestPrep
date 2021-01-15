package Spring2021;

public class BinaryTree {

    TreeNode root;

    public boolean add(int data) {
        if(root == null) {
            root = new TreeNode(data);
            return true;
        }
        return root.addNode(data);
    }

    public void printOrder() {
        if(root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print("Post Order : ");
        printPostOrder(root);
        return;
    }

    public void printPostOrder(TreeNode root) {
        if(root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.value);
        System.out.print(", ");
    }
    public static void main(String[] args) {
     BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(10);
        binaryTree.add(9);
        binaryTree.add(15);

        binaryTree.printOrder();


    }
}
