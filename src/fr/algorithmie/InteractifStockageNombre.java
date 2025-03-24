package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int[] tab = new int[5];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int nb = 0;
        while(true){
            System.out.println("choisissez :\n1: ajouter un nombre\n2:afficher le tableau");
            nb = scanner.nextInt();
            if(nb == 1){
                System.out.println("saisissez le nombre");
                if(index >= tab.length) tab = agrandirTab(tab);
                nb = scanner.nextInt();
                tab[index] = nb;
                index++;
            }else if(nb == 2){
                for(int val : tab){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
    public static int[] agrandirTab(int[] tab){
        int[] newTab = new int[tab.length+1];
        for(int i =0; i< tab.length; i++){
            newTab[i] = tab[i];
        }
        return newTab;
    }
}
