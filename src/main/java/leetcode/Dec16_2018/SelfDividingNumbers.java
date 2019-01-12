package main.java.leetcode.Dec16_2018;

import java.util.ArrayList;
import java.util.List;

/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for( int i = left; i <=right; i++){
            if(isSelfDividNumber(i))
                res.add(new Integer(i));

        }
        return res;
    }
    private boolean isSelfDividNumber(int i){

        if(i<10){
            return true;
        }
        if(i%10 ==0)
            return false;
        int temp =i/10;
        int x =  i%10;
        while(temp!=0){
            if(x!=0 &&i%x!=0)
                return false;
            else {

                x = temp%10;
                if(x!=0 &&i%x!=0)
                    return false;
                else if( x==0)
                    return false;
                else
                temp = temp / 10;
            }
        }
        return true;
    }

    public static void main(String [] args){

        /*
        left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
         */
        SelfDividingNumbers sdn = new SelfDividingNumbers();
        List<Integer> s = sdn.selfDividingNumbers(66, 708);
        for(int i=0; i <s.size(); i++ ){
            System.out.print(s.get(i) + " ");
        }
    }
}
