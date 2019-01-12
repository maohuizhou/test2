package main.java.leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main (String[] args){
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        Solution s = new Solution();
        System.out.println(s.numUniqueEmails(emails)) ;
    }

    public int numUniqueEmails(String[] emails) {
        StringBuilder sb = new StringBuilder();
        Set set = new HashSet();
        for( int i = 0; i< emails.length; i++){
            String [] sArr = emails[i].split("@");
            int index = sArr[0].indexOf('+');

            if(index>0){
                sb.append(sArr[0].substring(0, index).replace(".",""));
            }
            else
                sb.append(sArr[0].replace(".",""));
            sb.append("@").append(sArr[1]);
            if(!set.contains(sb.toString()))
                set.add(sb.toString());
            System.out.println(sb.toString());
            sb= new StringBuilder();


        }
        return set.size();
    }
}