package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nb = -1;
        while(nb<=0){
            System.out.println("Saisissez un rang supérieur a 0");
            nb = scanner.nextInt();
        }
        int[] tab = new int[nb];
        tab[0] = 0;
        if(tab.length>1) tab[1]=1;
        for(int i=2; i<nb; i++){
            tab[i] = tab[i-1]+tab[i-2];
        }
        System.out.println(tab[nb-1]);
    }

}
