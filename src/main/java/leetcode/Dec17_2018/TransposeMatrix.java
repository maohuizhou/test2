package main.java.leetcode.Dec17_2018;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        printMatrix(A);
        int[][] B = new int[A[0].length][A.length];

        for(int i =0; i< B.length; i++){
            for(int j =0 ; j< B[0].length; j++){
                if(j!=i){
                    B[i][j] = A[j][i];

                }else
                    B[i][j] =A[i][j];
            }
        }
        printMatrix(B);

        return B;

    }

    public static void main(String[] args){
        TransposeMatrix tm = new TransposeMatrix();
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] C = {{1,2,3},{4,5,6}};
        int[][] b = tm.transpose(A);
        int[][] d = tm.transpose(C);



    }
    private void printMatrix(int[][] a){
        for(int i =0; i<a.length;i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

    }


}
