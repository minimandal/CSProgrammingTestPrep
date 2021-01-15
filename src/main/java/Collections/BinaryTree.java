package Collections;

public class BinaryTree {

    TreeNode root;

    public boolean add(int data) {
        if(root == null) {
            root = new TreeNode(data);
            return true;
        }
        return root.addNode(data);
    }

    public void printInOrder() {
        if(root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print("In Order : ");
        printInOrder(root);
        System.out.println();
        System.out.print("Pre Order : ");
        printPreOrder(root);
        System.out.println();
        System.out.print("Post Order : ");
        printPostOrder(root);
        return;
    }

    public void printInOrder(TreeNode root) {
        if(root == null) return;
        printInOrder(root.left);
        System.out.print(root.value);
        System.out.print(", ");
        printInOrder(root.right);
    }

    public void printPreOrder(TreeNode root) {
        if(root == null) return;
        System.out.print(root.value);
        System.out.print(", ");
        printInOrder(root.left);
        printInOrder(root.right);
    }

    public void printPostOrder(TreeNode root) {
        if(root == null) return;
        printInOrder(root.left);
        printInOrder(root.right);
        System.out.print(root.value);
        System.out.print(", ");
    }
    public static void main(String[] args) {
     BinaryTree binaryTree = new BinaryTree();

//     tree.add(5);
//     tree.add(3);
//     tree.add(4);
        binaryTree.add(34);
        binaryTree.add(10);
        binaryTree.add(30);
        binaryTree.add(58);
        binaryTree.add(37);
        binaryTree.add(79);
        binaryTree.add(27);
        binaryTree.add(50);
        binaryTree.add(33);
        binaryTree.printInOrder();


    }
}
