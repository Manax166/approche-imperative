package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
        for (int i = 0; i <= 9; i++) {
            if(i%2 == 1) System.out.println(i);
        }
        int index = 1;
        while(index<11){
            System.out.println(index);
            index++;
        }
        index = 0;
        while(index<11){
            if(index%2 == 0) System.out.println(index);
            index++;
        }
        index = 0;
        while(index<10){
            if(index%2 == 1) System.out.println(index);
            index++;
        }
    }
}
