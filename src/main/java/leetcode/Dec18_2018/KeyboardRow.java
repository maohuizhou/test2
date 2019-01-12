package main.java.leetcode.Dec18_2018;

import java.util.ArrayList;
import java.util.List;

/*
Given a List of words, return the words that can be typed using letters of alphabet
on only one row's of American keyboard like the image below.






Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String firstRow="qwertyuiop";
        String secondRow ="asdfghjkl";
        String thirdRow="zxcvbnm";

        List<String> l = new ArrayList<String>();
        for ( int i =0; i<words.length; i++){
            boolean isOneRow = true;
            boolean onFirst = firstRow.indexOf(words[i].toLowerCase().charAt(0))>-1?true:false;
            boolean onSecond = secondRow.indexOf(words[i].toLowerCase().charAt(0))>-1?true:false;
            boolean onThird =  thirdRow.indexOf(words[i].toLowerCase().charAt(0))>-1?true:false;
            for(char c:words[i].toLowerCase().toCharArray()){
                if(onFirst){
                    isOneRow = isOneRow &&onFirst && (firstRow.indexOf(c)>-1);
                    onSecond = false;
                    onThird =false;
                    if(!isOneRow)
                        break;
                }
                else if(onSecond) {
                    isOneRow = isOneRow &&onSecond &&(secondRow.indexOf(c)>-1);
                    onFirst = false;
                    onThird = false;
                    if(!isOneRow)
                        break;
                }
                else if(onThird) {
                    isOneRow = isOneRow && onThird &&(thirdRow.indexOf(c)>-1);
                    onFirst = false;
                    onSecond = false;
                    if(!isOneRow)
                        break;
                }
            }
            if(isOneRow){
                l.add(words[i]);
            }

        }
        String[] res = new String[l.size()];
        int i =0 ;
        for (String word: l) {
            res[i] = word;
            i++;

        }
        return res;
    }
    public static void main(String [] args){
        KeyboardRow kbr =new KeyboardRow();
        String[] words = {"a","b"};
        String [] res = kbr.findWords(words);
        for(String s : res){
            System.out.print(s + " ");
        }

    }
}
