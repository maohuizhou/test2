package main.java.leetcode.Dec16_2018;
/*
Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Notes:

1 <= A.length = A[0].length <= 20
0 <= A[i][j] <= 1
 */
public class FlippingAnImage {

    public int[][] flipImage(int[][] a){
        System.out.println("=============== original ========");
        print(a);
        return inverse(flip(a));

    }
     private int[][] flip(int[][] a){
int temp = 0;
        for(int i = 0; i <a.length; i++){
            for(int j=0; j<a[0].length/2; j++){
                temp = a[i][j];
                a[i][j] = a[i][a[0].length-1-j];
                a[i][a[0].length-1-j] = temp;

            }
        }
        System.out.println("=============== flip ========");
        print(a);
        return a;
     }

     private int[][] inverse(int[][] a){
         for(int i = 0; i <a.length; i++){
             for(int j=0; j<a[0].length; j++){
                 a[i][j] = (a[i][j]+1)%2;

             }
         }
         System.out.println("=============== inverse ========");
         print(a);
         return a;
     }


     public static void main (String[] args){
        FlippingAnImage f = new FlippingAnImage();
        int[][] a = {{1,1,0,0},
                     {1,0,0,1},
                     {0,1,1,1},
                     {1,0,1,0}};
        int[][] b = f.flipImage(a);

         f.print(b);

     }
public void print(int[][] a){
    System.out.println("------------------");
    for(int i = 0; i <a.length; i++){
        for(int j=0; j<a[0].length; j++){
            System.out.print(a[i][j]);

        }
        System.out.print("\n");
    }
}
}
