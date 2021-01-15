package Spring2021;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
    public boolean addNode(int data) {
        TreeNode newNode = new TreeNode(data);
        if(data <= value) {
            if(left == null) {
                left = newNode;
                return true;
            }else {
                return left.addNode(data);
            }
        } else {
            if(right == null) {
                right = newNode;
                return true;
            }else {
                return right.addNode(data);
            }
        }
    }
}
