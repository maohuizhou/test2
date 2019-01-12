package main.java.leetcode.Dec21_2018;
/*
Given an array consisting of n integers, find the contiguous subarray of given length k
that has the maximum average value. And you need to output the maximum average value.

Example 1:
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
Note:
1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].
 */
public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum,sum =0;
         for(int i=0; i<k; i++){
             sum+=nums[i];
         }
         maxSum = sum;
         for(int i = k; i <nums.length-1; i++){
             sum =sum-nums[i-k]+nums[i];
             maxSum = Math.max(maxSum,sum);
         }

return (maxSum*1.0/k);
    }


    public static void main(String [] args){
        MaximumAverageSubarray masa = new MaximumAverageSubarray();
        int[] a ={1,12,-5,-6,50,3};
        System.out.println(masa.findMaxAverage(a,4));
    }

}
