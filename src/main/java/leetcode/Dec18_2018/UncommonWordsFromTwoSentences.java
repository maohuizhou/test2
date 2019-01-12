package main.java.leetcode.Dec18_2018;

import java.util.*;

/*
We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word
consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not
appear in the other sentence.

Return a list of all uncommon words.

You may return the list in any order.



Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]
 */
public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences1(String A, String B) {
        String [] sArray = (A+ " "+ B).split("\\s+");
        //Map<String,Integer> commonMap = new HashMap<String,Integer>();
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String s : sArray){
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);

        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> itr = set.iterator();
        List<String> list = new ArrayList<String>();
        Map.Entry<String,Integer> entry;
        while(itr.hasNext()){
            entry =itr.next();
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }

        }
        String [] res = new String[list.size()];
        int i =0;
        for(String s:list){
            res[i] =s;
            i++;
        }
        return res;
    }

    public String[] uncommonFromSentences(String A, String B) {
            int wordStart = 0;
            String S = A+ " "+B;
            Set<String> set = new HashSet<String>();
            List<String> uncommon = new ArrayList<String>();
         for(int i =0 ; i<S.length(); i++){
             String a;
             if(S.charAt(i) == ' ' || i == S.length()-1){

                 if(i == S.length()-1)
                     a = S.substring(wordStart);
                 else a = S.substring(wordStart, i);

                 wordStart =i+1;
                 if(S.indexOf(a,wordStart)<0 && !set.contains(a)){
                     uncommon.add(a);
                 }
                 set.add(a);


             }
         }
        String [] res = new String[uncommon.size()];
        return uncommon.toArray(res);
    }
    public static void main(String[] args){

        UncommonWordsFromTwoSentences uc = new UncommonWordsFromTwoSentences();
        String a = "this apple is sweet";
        String b = "this apple is sour";
        String [] res =uc.uncommonFromSentences(a, b);
        for(String s: res){
            System.out.print(s+" ");
        }

    }

}
