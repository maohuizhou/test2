package main.java.leetcode;

import java.util.LinkedList;
import java.util.List;

public class DeleteColumnsToMakeSorted {

    public int deleteColumnsToMakeSorted(String[] a){
        List<String> d = new LinkedList();
        int sLength = a[0].length();
int count=0;
        for(int i = 0; i < sLength; i++){
            StringBuilder sb = new StringBuilder();
            boolean nonDecreasing = true;
            char c = a[0].charAt(i);
            for(int j = 0; j<a.length; j++){
               if( a[j].charAt(i) <  c) {
                   nonDecreasing = nonDecreasing && false;
               }
                sb.append(a[j].charAt(i));
                c = a[j].charAt(i);
            }
            if(!nonDecreasing)
                count++;
            System.out.println(sb.toString());


        }
        System.out.println(count);

        return count;
    }

    public static void main(String [] args){

        DeleteColumnsToMakeSorted dctms = new DeleteColumnsToMakeSorted();
        String [] a = {
                "rrjk","furt","guzm"
        };
        dctms.deleteColumnsToMakeSorted(a);
    }

}
