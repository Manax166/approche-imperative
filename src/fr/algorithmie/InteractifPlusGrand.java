package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        int max =0;
        int count =0;
        while(count<10){
            nb = scanner.nextInt();
            if(nb>max) max = nb;
            count++;
        }
        System.out.println(max);
    }
}
