package przemekNachel;

public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode node) {
//        if (left == null) left = node;
//        else if (node.getValue() <= left.getValue()) left.setLeft(node);
//        else if (node.getValue() > left.getValue()) left.setRight(node);
        left = node;
    }

    public void setRight(TreeNode node) {
//        if (right == null) right = node;
//        else if (node.getValue() <= right.getValue()) right.setLeft(node);
//        else if (node.getValue() > right.getValue()) right.setRight(node);
        right = node;
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getValue());
            inorderRec(root.getRight());
        }
    }
}
