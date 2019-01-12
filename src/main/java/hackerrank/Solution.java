package main.java.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int count = 0;
        while(i < c.length-1){
            if(c[i+1] == 0 ){
                if(i+2 < c.length && c[i+2] == 0){
                    i=i+2;
                }
                else
                    i=i+1;


            }
            else{
                i=i+2;
            }
            count = count+1;
        }
        return count;
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count = 0;
        boolean inValley = false;
        Stack stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (stack.size() == 0) {
                if (c == 'D')
                    inValley = true;
                else
                    inValley = false;

                stack.push(c);
            }
            else{
                if(s.charAt(i) != (char)stack.peek()){
                    stack.pop();
                    if( stack.size() == 0 && c == 'U' && inValley)
                        count++;
                }
                else
                    stack.push(c);
            }


        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int n = 8;
       String s = "UDDDUDUU";

     //   int result = countingValleys(n, s);
        int[] c = new int[]{0,0,0,1,0,0};
        int result = jumpingOnClouds( c);

       System.out.println(c.length + "\n " + c.toString()  + "\n" + result);
    }
}
