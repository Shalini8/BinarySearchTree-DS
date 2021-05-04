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
    @Test
    public void givenThreeNumbers_whenAddedToTree_ShouldReturnSizeThree(){
        BinaryTree<Integer> customBinaryTree = new BinaryTree<>();
        customBinaryTree.add(56);
        customBinaryTree.add(30);
        customBinaryTree.add(70);
        customBinaryTree.add(22);
        customBinaryTree.add(40);
        customBinaryTree.add(60);
        customBinaryTree.add(95);
        customBinaryTree.add(11);
        customBinaryTree.add(65);
        customBinaryTree.add(3);
        customBinaryTree.add(16);
        customBinaryTree.add(63);
        customBinaryTree.add(67);

        int size = customBinaryTree.getSize();
        Assertions.assertEquals(13,size);
    }
    @Test
    public void GivenNumbers_whenAddedToTree_ShouldBe_AbleFindNode(){
        BinaryTree<Integer> customBinaryTree = new BinaryTree<>();
        customBinaryTree.add(56);
        customBinaryTree.add(30);
        customBinaryTree.add(70);
        customBinaryTree.add(22);
        customBinaryTree.add(40);
        customBinaryTree.add(60);
        customBinaryTree.add(95);
        customBinaryTree.add(11);
        customBinaryTree.add(65);
        customBinaryTree.add(3);
        customBinaryTree.add(16);
        customBinaryTree.add(63);
        customBinaryTree.add(67);
        Assertions.assertTrue(customBinaryTree.findNode(16));
    }
}


