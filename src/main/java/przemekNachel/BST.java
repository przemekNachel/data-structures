package przemekNachel;

public class BST {

    private TreeNode root;

    public void add(int value) {
        if (root == null) {
            root = new TreeNode(value);}
        else if (value <= root.getValue()) root.setLeft(new TreeNode(value));
        else if (value > root.getValue()) root.setRight(new TreeNode(value));
    }

    public void print() {
        root.inorderRec(root);
    }
}
