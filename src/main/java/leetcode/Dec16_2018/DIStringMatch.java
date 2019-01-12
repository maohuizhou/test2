package main.java.leetcode.Dec16_2018;
/*
Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]

 */
public class DIStringMatch {
    public int[] diStringMatch(String S) {

        int n = S.length(), left = 0, right = n;
        int[] res = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            res[i] = S.charAt(i) == 'I' ? left++ : right--;
            System.out.print(res[i] +" ");
        }
        res[n] = left;
        return res;
    }
    public static void main(String arg[]){
        DIStringMatch dism = new DIStringMatch();
        int[] x = dism.diStringMatch("DIDIDDD");
        //for(int i=0; i<x.length;i++)
          //  System.out.print(x[i] +" ");

    }
}
