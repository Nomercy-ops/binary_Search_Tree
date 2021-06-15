package com.bridgelabz.datastructure.BinarySearchTree;

/**
 * This is the runner class and it contains the the main method.
 * From here we can perform the binary search tree operations.
 */

public class Runner {

    public static void main(String[] args) {
        BinarySearchTree binarysearchtree = new BinarySearchTree();
        binarysearchtree.insert(56);
        binarysearchtree.insert(30);
        binarysearchtree.insert(70);
        binarysearchtree.insert(22);
        binarysearchtree.insert(40);
        binarysearchtree.insert(11);
        binarysearchtree.insert(3);
        binarysearchtree.insert(16);
        binarysearchtree.insert(60);
        binarysearchtree.insert(95);
        binarysearchtree.insert(65);
        binarysearchtree.insert(63);
        binarysearchtree.insert(67);
        System.out.println("The size of binary tree is : " + binarysearchtree.size());
        System.out.println(binarysearchtree.SearchNode(binarysearchtree.root, 65));     
       
    }
}
