package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest
{
   @Test
   public void numbersAddedToTreeReturnSize() {
      BinaryTree<Integer> binaryTree = new BinaryTree<>();
      binaryTree.add(56);
      binaryTree.add(30);
      binaryTree.add(70);
      Assert.assertEquals(3, binaryTree.getSize());
   }
}
