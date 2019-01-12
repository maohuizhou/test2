package main.java.leetcode.Jan_09_2019;
/*
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.



Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
 */

public class RangeSumOfBST {
    int sum =0;
    public int rangeSumBST(TreeNode root, int L, int R) {

        r(root, L,R);
        return sum;
    }
    private void r(TreeNode root, int L, int R){

        if(root == null)
            return;
        if(root.val > L && root.val<=R){
            sum +=root.val;
        }
        r(root.left, L, R);
        r(root.right,L,R);

    }
    public static void main(String [] args){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(5);

        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(3);

        tree1.left.right = new TreeNode(4);
        tree1.right.right = new TreeNode(7);

        RangeSumOfBST rs =  new RangeSumOfBST();
        System.out.println(rs.rangeSumBST(tree, 1,3));
    }

}
