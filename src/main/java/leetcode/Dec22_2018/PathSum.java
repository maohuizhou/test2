package main.java.leetcode.Dec22_2018;
/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSum {
    public boolean hasPathSum1(TreeNode root, int sum) {
        int tempSum = sum-root.val;
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            return tempSum == 0;
        }


        return hasPathSum1(root.left, tempSum) || hasPathSum1(root.right,tempSum);
    }
    public boolean hasPathSum(TreeNode root, int sum) {
    if(root ==null)

    {
        return false;
    }

    sum -=root.val;
        if((root.left ==null)&&(root.right ==null))

    {
        return (sum == 0);
    }
        return

    hasPathSum(root.left, sum) ||

    hasPathSum(root.right, sum);

}
    public static void main(String [] args){


    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
