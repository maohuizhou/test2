package main.java.leetcode.Dec22_2018;

import javafx.collections.ArrayChangeListener;
import main.java.leetcode.Dec16_2018.ArrayPartitionI;
import org.junit.internal.ArrayComparisonFailure;

/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(1+8*n) -1)/2);

    }
    public int arrangeCoins1(int n){
        /*int count =0;
        for(int i=1; i<=n; i++){

            n=n-i;
            count++;
        }
        return count;
        */
        int totalRows = 0;

        for (int i = 1; i <= n; i++) {
            n = n - i;
            totalRows++;
        }

        return totalRows;
    }
    public static void main(String [] args){
        ArrangingCoins ac = new ArrangingCoins();
        System.out.println(ac.arrangeCoins(1211231230));
        System.out.println(ac.arrangeCoins1(1211231230));
    }
}
