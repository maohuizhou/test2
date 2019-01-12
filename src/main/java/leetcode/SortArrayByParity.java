package main.java.leetcode;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] b = new int[A.length];
        int [] c = new int[A.length];
        int evenIndex=0;
        int oddIndex = A.length -1;
        for( int i =0; i< A.length; i++){
            if(A[i]%2==0){
                b[evenIndex] = A[i];
                evenIndex++;
            }
            else {
                b[oddIndex] = A[i];
                oddIndex--;
            }
        }
        return b;
    }
    public static void main(String[] args){

        SortArrayByParity sap = new SortArrayByParity();
        int[] a ={3,1,2,4};
        int [] b = sap.sortArrayByParity(a);
        for(int i =0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
    }

}
