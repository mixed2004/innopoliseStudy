package ru.MaximBorisov.Lesson32;

public class Node {
    public int root;
    public Node right;
    public Node left;

    public Node(int root) {
        this.root = root;
        right=left=null;
    }
}
