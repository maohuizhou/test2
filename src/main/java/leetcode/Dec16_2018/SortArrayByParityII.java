package main.java.leetcode.Dec16_2018;


import java.util.ArrayList;
import java.util.List;


/*
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.



Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


Note:

2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000

 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {

        List<Pair> evenQueue = new ArrayList<Pair>();
        List<Pair> oddQueue = new ArrayList<Pair>();
        for(int i =0; i < A.length; i++) {
            if((A[i]%2==0 && i%2 !=0) ){// odd position with even value
                if(evenQueue.size()>0){
                    Pair p = evenQueue.get(0);
                    if(p!=null) {
                        int temp = A[i];
                        A[i] = (int) p.getValue();
                        A[(int) p.getKey()] = temp;
                    }
                    evenQueue.remove(0);
                }
                else
                oddQueue.add(new Pair(i, A[i]));

            }
            else if(A[i]%2==1 && i%2 ==0 ) { // even position with odd value
                if(oddQueue.size()==0){
                    evenQueue.add(new Pair(i, A[i]));
                }
                else {
                    Pair p = oddQueue.get(0);
                    if (p != null) {
                        int temp = A[i];
                        A[i] = (int) p.getValue();
                        A[(int) p.getKey()] = temp;
                    }
                    oddQueue.remove(0);
                }
            }

        }
        return A;
    }

    public static void main(String[] args){
        int[] A = {3,4};
        SortArrayByParityII sabp =  new SortArrayByParityII();

        int[] B = sabp.sortArrayByParityII(A);
        for (int i = 0; i< A.length; i++){
            System.out.print( B[i] + " ");
        }
    }

    class Pair{
        private int key;
        private int value;

        public Pair(int key, int  value){
            this.key = key;
            this.value = value;
        }

        public int getKey(){
            return this.key;
        }
        public int getValue(){
            return this.value;
        }

    }
}
