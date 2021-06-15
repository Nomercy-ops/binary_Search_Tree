package com.bridgelabz.datastructure.BinarySearchTree;

/**
 * This is the Node class.
 * It is used for creating node for binary search tree.
 * 
 */

class Node {

    int data;
    Node left, right;

    // constructor for node class
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // getter and setter.
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    
    
}
