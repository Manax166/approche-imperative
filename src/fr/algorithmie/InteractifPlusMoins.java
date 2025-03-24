package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        int nbATrouver = (int) (Math.random()*100);
        int count = 0;
        while(nb != nbATrouver){
            nb = scanner.nextInt();
            if(nb<nbATrouver) System.out.println("+");
            else if(nb>nbATrouver) System.out.println("-");
            count++;
        }
        System.out.println("Bravo, vous avez trouvé en " + count+ " coups");
    }
}
