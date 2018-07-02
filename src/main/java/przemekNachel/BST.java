package przemekNachel;

public class BST {

    private TreeNode root;

    public void add(int value) {
        root = addRecursive(root, value);
//        if (root == null) {
//            root = new TreeNode(value);}
//        else if (value <= root.getValue()) root.setLeft(new TreeNode(value));
//        else if (value > root.getValue()) root.setRight(new TreeNode(value));
    }

    public void print() {
        root.inorderRec(root);
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) return new TreeNode(value);
        else if (value <= current.getValue()) current.setLeft(addRecursive(current.getLeft(), value));
        else if (value > current.getValue()) current.setRight(addRecursive(current.getRight(), value));
        return current;
    }
}
