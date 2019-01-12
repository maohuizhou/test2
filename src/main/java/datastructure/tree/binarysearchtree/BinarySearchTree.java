package main.java.datastructure.tree.binarysearchtree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        right = null;
        left = null;
    }

}
public class BinarySearchTree{

    Node root;


    // inserting a value
    public void add(int value){
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node currNode, int value){
        if(currNode == null){
            return new Node(value);

        }
        if(value<currNode.value){
            currNode.left = addRecursive(currNode.left,value);
        }
        else if(value>currNode.value){
            currNode.right = addRecursive(currNode.right, value);
        }
        else
            return currNode;

        return currNode;
    }

    //finding an element
    public boolean containsNode(int value){
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node currNode, int value){
        if(currNode == null){
            return false;
        }
        if(value == currNode.value)
            return true;
        return value<currNode.value?containsNodeRecursive(currNode.left, value): containsNodeRecursive(currNode.right, value);
    }

    // deleting an element
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node currNode, int value){

        if( currNode ==null){
            return null;
        }

        if (value == currNode.value) {
            // Node to delete found
            // ... code to delete the node will go here
            if (currNode.left == null && currNode.right == null) {
                return null;
            }
            if (currNode.right == null) {
                return currNode.left;
            }

            if (currNode.left == null) {
                return currNode.right;
            }

        }
        if (value < currNode.value) {
            currNode.left = deleteRecursive(currNode.left, value);
            return currNode;
        }
        currNode.value = findSmallestValue(currNode.right);

        currNode.right = deleteRecursive(currNode.right, value);
        return currNode;

    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }


    private BinarySearchTree createBinaryTree() {
        BinarySearchTree bt = new BinarySearchTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinarySearchTree bt = createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

}


