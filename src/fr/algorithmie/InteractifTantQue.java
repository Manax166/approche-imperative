package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        while(nb<1 || nb>10){
            System.out.println("merci de saisir un nombre entre 1 et 10 inclus");
            nb = scanner.nextInt();
        }
        System.out.println(nb);

    }
}
