package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        for (int val : array){
            System.out.println(val);
        }
        for(int i = array.length-1; i>-1; i--){
            System.out.println(array[i]);
        }
        int[] arrayCopy = new int[array.length];
        for(int i=0; i< array.length; i++){
            arrayCopy[i] = array[i];
            System.out.println(arrayCopy[i]);
        }
    }
}
