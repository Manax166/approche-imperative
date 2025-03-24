package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        int last = array[array.length-1];
        for(int i = array.length-1; i>-1; i--){
            if(i == 0) array[i] = last;
            else array[i] = array[i-1];
        }
        for(int val : array){
            System.out.println(val);
        }
    }
}
