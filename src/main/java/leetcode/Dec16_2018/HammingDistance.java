package main.java.leetcode.Dec16_2018;
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.
 */
public class HammingDistance {

    public int getDistance(int x, int y){

      Integer x1 = new Integer(x);
      Integer.bitCount(x^y);

        return Integer.bitCount(x^y);
    }

    public static void main(String[] args){

        HammingDistance hd = new HammingDistance();
        System.out.println(hd.getDistance(1,4));

    }

}
