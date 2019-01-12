package main.java.leetcode.Dec18_2018;
/*
Given a string S and a character C, return an array of integers representing
the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]


Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
 */
public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {

        int[] res = new int[S.length()];
        int index = S.indexOf(C);
        int index1 = 0;
        boolean isMultipleIndex = false;
        for(int i = 0; i<S.length(); i++){
            if(i <= index ){
                if(!isMultipleIndex)
                    res[i]=index-i;
                else{
                    res[i] = Math.min(index-i, i-index1);
                }
            }
            else{
                int temp =  S.indexOf(C, index+1);
                index1 = index;

                if(temp >-1){
                    isMultipleIndex = true;
                    index = temp;
                    res[i] = Math.min(index-i, i-index1);
                }
                else
                    res[i] =  i-index1;
            }

        }
        return res;

    }
    public static void main(String[] args){

       ShortestDistanceToACharacter sc = new ShortestDistanceToACharacter();
       int[] res = sc.shortestToChar("loveleetcode",'e');
       sc.printArray(res);

    }
private void printArray(int[] a){
        for (int x: a){
            System.out.print(x + " ");
        }
}
}
