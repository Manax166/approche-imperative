package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        while(nb<1 || nb>10){
            System.out.println("merci de saisir un nombre entre 1 et 10 inclus");
            nb = scanner.nextInt();
        }
        System.out.println("Table de " + nb);
        for(int i=1; i<=10;i++){
            System.out.println(nb + " x " + i + " : " +(nb*i));
        }
    }
}
