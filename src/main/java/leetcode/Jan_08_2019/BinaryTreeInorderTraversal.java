package main.java.leetcode.Jan_08_2019;
/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
 */


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeInorderTraversal {
        List <Integer> list_inorder = new ArrayList<Integer>();
    List <Integer> list_pre = new ArrayList<Integer>();
    List <Integer> list_post = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList<Integer>();
        inorderTraversal(root, list);
        return list;

    }
    private void inorderTraversal(TreeNode root, List<Integer> list){
        if( root == null)
            return;
        inorderTraversal(root.left,list);
        this.list_inorder.add(root.val);
        System.out.println(root.val);
        inorderTraversal(root.right, list);


    }
    public   void  preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        int val = 0;
        if(root == null)
            return;

        this.list_pre.add(root.val);
        System.out.println(root.val);
        preorderTraversal(root.left);

        preorderTraversal(root.right);

    }
    public   void  postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        int val = 0;
        if(root == null)
            return;


        postOrderTraversal(root.left);

        postOrderTraversal(root.right);
        this.list_post.add(root.val);
        System.out.println(root.val);
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        BinaryTreeInorderTraversal btt = new BinaryTreeInorderTraversal();
        List<Integer> list = btt.inorderTraversal(tree);
        System.out.println("======================");
        btt.preorderTraversal(tree);
        System.out.println("======================");
        btt.postOrderTraversal(tree);


    }
} class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val =x;}
}
