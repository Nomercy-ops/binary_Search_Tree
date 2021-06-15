/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 14.06.21
 *
 * purpose: is to create a binary search tree and perform operations Insert,Search and Finding size.
 *
 */

package com.bridgelabz.datastructure.BinarySearchTree;

public class BinarySearchTree {

    // binary tree root
    Node root;

    /**
     * UC1: Method for inserting a node in binary search tree. if the root is
     * equal to null, it means that the tree is empty So, it creates a new node
     * and inserts the data into it
     *
     * @param data
     */
    public void insert(int data) {
        root = insertHelper(root, data);
    }

    private Node insertHelper(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(insertHelper(root.getLeft(), data));
        }
        if (data > root.getData()) {
            root.setRight(insertHelper(root.getRight(), data));
        }
        return root;

    }
	
	/**
     * UC2: Java function to return number of nodes from this binary search
     * tree.
     *
     * @return size
     */
    public int size() {
        return size(root);
    }

    /* computes number of nodes in tree */
    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return (size(node.left) + 1 + size(node.right));
        }
    }

}
