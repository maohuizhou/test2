package main.java.leetcode.Dec18_2018;

import java.util.HashMap;
import java.util.Map;

/*
We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.



Example :
Input:
widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "abcdefghijklmnopqrstuvwxyz"
Output: [3, 60]
Explanation:
All letters have the same length of 10. To write all 26 letters,
we need two full lines and one line with 60 units.
Example :
Input:
widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "bbbcccdddaaa"
Output: [2, 4]
Explanation:
All letters except 'a' have the same length of 10, and
"bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
For the last 'a', it is written on the second line because
there is only 2 units left in the first line.
So the answer is 2 lines, plus 4 units in the second line.


Note:

The length of S will be in the range [1, 1000].
S will only contain lowercase letters.
widths is an array of length 26.
widths[i] will be in the range of [2, 10].
 */
public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
         int[] res = new int[2];
        int numberOfLine =1;
        int units = 0;

        for(char c: S.toCharArray()){
            int temp = widths[c-97];
            if(temp + units < 100)
                units = temp + units;
            else {
                numberOfLine = numberOfLine +1;

                if (units + temp == 100) {
                    units = 0;
                } else
                    units = temp;
            }
        }
        res[0]=numberOfLine;
        res[1]=units;
    return res;
    }
    public static void main(String[] args){

        NumberOfLinesToWriteString ns = new NumberOfLinesToWriteString();

        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        int[] res1 = ns.numberOfLines(widths, S);
        ns.printArray(res1);
        int[] widths1 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        S = "bbbcccdddaaa";
        res1 = ns.numberOfLines(widths1, S);
        ns.printArray(res1);

    }
private void printArray(int[] a){
        for(int s: a){
            System.out.print(s + " ");
        }
}
}
