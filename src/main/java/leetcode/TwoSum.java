package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bztlgx on 5/7/2018.
 */
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums =  {2, 7, 11, 15};
		int[] results = ts.findTwoSum( nums, 9);
       for( int i = 0; i <2; i++){
	       System.out.println( " " + results[i]);

		}
	}

	public int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] results = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(target - nums[i]))
				map.put(nums[i], i);
			else {
				results[0] = map.get(target - nums[i]);
				results[1] = i;

			}

		}
		return results;
	}


}
