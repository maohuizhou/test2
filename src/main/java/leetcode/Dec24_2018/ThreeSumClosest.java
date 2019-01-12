package main.java.leetcode.Dec24_2018;

import main.java.leetcode.Dec17_2018.TransposeMatrix;
import sun.reflect.generics.tree.Tree;

/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3)
            return 0;
        int t = target;
        int sum = nums[0]+nums[1]+nums[2];
        int closestSum = sum;
        if(nums.length == 3)
            return sum;
        for(int i =3 ; i<nums.length; i++ ){
            int temp = sum-nums[i-3] + nums[i] ;
            if(Math.abs(temp - target) <= Math.abs(sum - target)){
                closestSum = temp;
                sum = temp;
            }
        }
        return closestSum;
    }
    public static void main(String[] args){
        ThreeSumClosest tsc = new ThreeSumClosest();
        int[] a = {-3, -2, -5, 3, -4};
        int res = tsc.threeSumClosest(a, -1);
        System.out.println(res);
    }
}
