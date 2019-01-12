package main.java;

import java.util.HashMap;
import java.util.Map;

public class OOP_11_14 {

    public void manipulate(String s){
        this.s1 = "adfa";

    }
    String s1="s1s1s1";
     public static void main(String args[]){
         String s = "asdfaAsdfadsf";
         OOP_11_14 oop = new OOP_11_14();
         System.out.println(oop.s1);
         oop.manipulate(s);

         System.out.println(s);
         System.out.println(oop.s1);

         Map map = new HashMap<Integer, Integer>();
         map.put(1,2);
         map.get(1) ;

     }
}
