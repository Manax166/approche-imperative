package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tab = {1, 3, 5, 6};
        System.out.println(tab.length>0 && (tab[0] == 6 || tab[tab.length-1] == 6));
    }
}
