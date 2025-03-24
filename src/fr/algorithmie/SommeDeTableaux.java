package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        int[] arraySum = array1.length>array2.length ? new int[array1.length] : new int[array2.length];
        for(int i = 0; i< arraySum.length; i++){
            int sum = 0;
            if(i< array1.length) sum +=array1[i];
            if(i< array2.length) sum +=array2[i];
            arraySum[i] = sum;
            System.out.println(sum);
        }
    }
}
