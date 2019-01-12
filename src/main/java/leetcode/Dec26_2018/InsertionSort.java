package main.java.leetcode.Dec26_2018;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsertionSort {
    public void insertionSort(int[] arr){

        for(int i=1; i< arr.length; i++){
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        printArray(arr);
    }
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6};

       // InsertionSort ob = new InsertionSort();
      //  ob.insertionSort(arr);

     //   printArray(arr);

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v)->{ v= v+10;});

        System.out.println("Hello ==================");

        items.forEach((k,v)->{
            //System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
              //  System.out.println("Hello E");
            }
        });
        List <Integer> number = Arrays.asList(2,3,4,5);
        List square = number.stream().map(x->2*x).collect(Collectors.toList());
        square.forEach((x)->{
            System.out.println(" new value: " + x );
        });
    }


}

