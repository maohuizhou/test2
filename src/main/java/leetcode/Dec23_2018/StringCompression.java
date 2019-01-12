package main.java.leetcode.Dec23_2018;
/*
Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.


Follow up:
Could you solve it using only O(1) extra space?


Example 1:

Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".


Example 2:

Input:
["a"]

Output:
Return 1, and the first 1 characters of the input array should be: ["a"]

Explanation:
Nothing is replaced.


Example 3:

Input:
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

Output:
Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

Explanation:
Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
Notice each digit has it's own entry in the array.
 */
public class StringCompression {
    public int compress(char[] chars) {
        if(chars == null){
            return 0;}
        if(chars.length<2)
            return 1;
        int count = 1;

        StringBuilder sb = new StringBuilder();
       // sb.append(chars[0]);
        for(int i = 0; i< chars.length-1; i++){
            if(chars[i]!=chars[i+1] || i+1 == chars.length) {

                sb.append(chars[i]);
                if(count >1)
                    sb.append(count);
                count=1;

            }
            else{
                count++;
            }

      }
        sb.append(chars[chars.length-1]);
      if(chars[chars.length-1]==chars[chars.length-2])
        sb.append(count);

char[] temp = sb.toString().toCharArray();
        for(int i=0; i<temp.length;i++){
            chars[i]=temp[i];
        }

      return  temp.length;

    }
    public static void main(String [] args){
        StringCompression sc = new StringCompression();
        char[] c ={'a','a','b','b','c','c','c'};
        char [] b = {'a', 'b','b','b','b','b','b','b','b','b','b','b','b'};
       System.out.println( sc.compress(b));


    }

}
