package main.java.leetcode.Dec16_2018;
/*

Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1
Example 2:

Input: [0,2,1,0]
Output: 1
Note:

3 <= A.length <= 10000
0 <= A[i] <= 10^6
A is a mountain, as defined above.
Accepted
 */
public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i + 1 < A.length; ++i) if (A[i] > A[i + 1]) return i;
        // for (int i = A.length - 1; i > 0; --i) if (A[i] > A[i - 1]) return i;
        return 0;
    }

    public static void main(String [] args){
        PeakIndexInAMountainArray pima = new PeakIndexInAMountainArray();
        int[] a ={3,4,5,1,0,1,2,3,1};
        int[] b ={0,2,1,0};
        System.out.println(pima.peakIndexInMountainArray(a));
        System.out.println(pima.peakIndexInMountainArray(b));

    }
}
