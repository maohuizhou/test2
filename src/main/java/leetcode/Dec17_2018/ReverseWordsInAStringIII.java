package main.java.leetcode.Dec17_2018;
/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s0: sArr){
            sb.append((new StringBuilder(s0)).reverse()).append(" ");

        }
        return sb.toString().trim();

    }
    public static void main(String [] args){
        ReverseWordsInAStringIII rw = new ReverseWordsInAStringIII();
        System.out.println( rw.reverseWords("Let's take LeetCode contest"));
    }
}
