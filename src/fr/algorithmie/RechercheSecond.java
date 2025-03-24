package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int max = 0;
        int second = 0;
        for(int val : array){
            if(max<val){
                second = max;
                max = val;
            } else if(second<val) second = val;
        }
        System.out.println(second);
    }
}
