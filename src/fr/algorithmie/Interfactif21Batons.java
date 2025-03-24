package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ordreDeJeu = new String[2];
        ordreDeJeu[(int) (Math.random()*2)] = "joueur";
        for(int i=0; i<2; i++){
            if (ordreDeJeu[i] == null) ordreDeJeu[i] = "ordinateur";
        }
        int batons = 21;
        int count = 0;
        int retire = 0;
        while(batons>1){
            count = count%2;
            retire = 0;
            System.out.println("tour de " + ordreDeJeu[count]);
            if(ordreDeJeu[count].equals("ordinateur")){
                if((batons-1)%4 > 0){
                    retire = (batons-1)%4;
                }else {
                    retire = (int) (Math.random()*3+1);
                }
            }else {
                System.out.println("saissisez un nombre entre 1 et 3");
                while(retire<1 || retire>3){
                    retire = scanner.nextInt();
                }
            }
            batons -= retire;
            System.out.println(ordreDeJeu[count] + " a retiré " + retire + " batons, il en reste " +batons);
            count++;
        }
        count--;
        System.out.println(ordreDeJeu[count] + " a gagné");
    }
}
