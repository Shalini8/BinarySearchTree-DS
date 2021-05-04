package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int size = binaryTree.getSize();
        Assertions.assertEquals(3, size);
    }
}


