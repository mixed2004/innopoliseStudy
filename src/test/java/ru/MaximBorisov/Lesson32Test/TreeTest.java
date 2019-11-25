package ru.MaximBorisov.Lesson32Test;

import org.junit.Test;
import ru.MaximBorisov.Lesson32.Node;
import ru.MaximBorisov.Lesson32.Tree;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TreeTest {
    @Test
    public void whenTreeWhithFourLeavesThenFour() {
        Tree tree = new Tree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);
        assertThat(tree.nimberLeaves(tree.root), is(4));
    }
}
