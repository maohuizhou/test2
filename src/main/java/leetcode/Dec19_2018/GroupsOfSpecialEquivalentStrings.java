package main.java.leetcode.Dec19_2018;

import java.util.*;

/*
893. Groups of Special-Equivalent Strings
Easy

103

302

Favorite

Share
You are given an array A of strings.

Two strings S and T are special-equivalent if after any number of moves, S == T.

A move consists of choosing two indices i and j with i % 2 == j % 2, and swapping S[i] with S[j].

Now, a group of special-equivalent strings from A is a non-empty subset S of A such that any string not in S is not special-equivalent with any string in S.

Return the number of groups of special-equivalent strings from A.



Example 1:

Input: ["a","b","c","a","c","c"]
Output: 3
Explanation: 3 groups ["a","a"], ["b"], ["c","c","c"]
Example 2:

Input: ["aa","bb","ab","ba"]
Output: 4
Explanation: 4 groups ["aa"], ["bb"], ["ab"], ["ba"]
Example 3:

Input: ["abc","acb","bac","bca","cab","cba"]
Output: 3
Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
Example 4:

Input: ["abcd","cdab","adcb","cbad"]
Output: 1
Explanation: 1 group ["abcd","cdab","adcb","cbad"]


Note:

1 <= A.length <= 1000
1 <= A[i].length <= 20
All A[i] have the same length.
All A[i] consist of only lowercase letters.
 */
public class GroupsOfSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {

      //  Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> set = new HashSet<String>();
        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        String key;
        char[] oArray;
        for (String s: A){

            for (int i = 0; i < s.length() ; i++) {
                char c = s.charAt(i);
                if (i % 2 == 0) {
                    sb0.append(c);
                }
                else
                    sb1.append(c);

            }
            oArray = sb0.toString().toCharArray();
            Arrays.sort(oArray);

            StringBuilder sb = new StringBuilder();
            for(int i =0; i< oArray.length;i++){
                sb.append(oArray[i]);
            }
            key = sb.toString();
            oArray = sb1.toString().toCharArray();
            Arrays.sort(oArray);
            for(int i =0; i< oArray.length;i++){
                sb.append((char)oArray[i]);
            }
            key = key +" "+ sb.toString();
         /*   if(map.containsKey(key)) {
               map.put(key, map.get(key) + 1);
            }
            else {
                map.put(key, 1);
            }

*/          set.add(key);
            sb0 = new StringBuilder();
            sb1 = new StringBuilder();
           }

           return set.size();
        }

        public static void main(String[] ars){
            GroupsOfSpecialEquivalentStrings gses = new GroupsOfSpecialEquivalentStrings();
            String[]// a ={"abc","acb","bac","bca","cab","cba"};
           //a={"aa","bb","ab","ba"};
            a={"ababaa","aaabaa"};
           System.out.println(  gses.numSpecialEquivGroups(a));

        }
}
