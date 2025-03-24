package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args){
        int[] tab = { 8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(tab[0]);
        System.out.println(tab.length);
        System.out.println(tab[tab.length-1]);
        //System.out.println(tab[10]);
        //Cet appel retourne une erreur car notre tableau ne contient que 8 éléments numérotés de 0 à 7
    }
}
