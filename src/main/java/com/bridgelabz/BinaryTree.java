package com.bridgelabz;

public class BinaryTree<K extends Comparable<K>>
{
   private BinaryNode<K> root;

      public void add(K key) {
         this.root = this.addRecursively(root, key);
      }

      private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
         if(current == null)
            return new BinaryNode<>(key);
         int result = key.compareTo(current.key);
         if(result == 0)
            return current;
         if(result < 0)
            current.left = addRecursively(current.left, key);
         else
            current.right = addRecursively(current.right, key);
         return current;
      }

      public int getSize() {
         return this.getSizeRecursively(root);
      }

      private int getSizeRecursively(BinaryNode<K> current) {
         return (current == null) ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
      }
}
