package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int nombreParfait = 496;
        int total = 0;
        for(int i=1;i<=nombreParfait/2;i++){
            if(nombreParfait%i == 0) total+=i;
        }
        System.out.println(total == nombreParfait);
    }
}
