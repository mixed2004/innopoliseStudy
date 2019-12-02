package ru.MaximBorisov.Lesson32;

public class Tree {
    public Node root;

    public int nimberLeaves(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left != null || root.right != null) {
            return nimberLeaves(root.left) + nimberLeaves(root.right);
        } else {
            return 1;
        }
    }
}
