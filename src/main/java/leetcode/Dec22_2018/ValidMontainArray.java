package main.java.leetcode.Dec22_2018;
/*
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[B.length - 1]


Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true


Note:

0 <= A.length <= 10000
0 <= A[i] <= 10000



 */
public class ValidMontainArray {
    public boolean validMountainArray(int[] A) {

        boolean isUp= true;

        int peaks=0;

        if(A==null || A.length<3) return false;

        for(int i =1; i<A.length; i++){


            if(A[i-1]>A[i] ){

                if(i==1)
                    return false;
                else {
                    if(isUp){
                        isUp = false;
                        peaks++;
                        if(peaks>1)
                            return false;
                    }
                }
            }
            else
                isUp = true;


        }
        return !isUp;
    }
    public boolean validMountainArray1(int [] A){
        int len = A.length;
        int i=0;

        if(len<3)
            return false;

        if (A[0] >=  A[1] || A[len-1] >= A[len-2])
            return false;

        while(i< (len-1) && A[i+1]>A[i])
            i++;

        while(i< (len-1) && A[i+1]<A[i])
            i++;

        return i==len-1;

    }
    public static void main(String [] args){
        int[] a= {1,7,9,5,4,1,2};
        int [] b = {0,3,2,1};
        ValidMontainArray va = new ValidMontainArray();
        System.out.println(va.validMountainArray(a ) +" " + va.validMountainArray(b));
        System.out.println(va.validMountainArray1(a ) +" " + va.validMountainArray1(b));
    }
}
