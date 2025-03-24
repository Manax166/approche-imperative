package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args){
        String[] tab = {"Lille", "Tourcoing", "Roubaix", "Amiens", "Creil"};
        for(String ville : tab){
            System.out.println(ville);
        }
        System.out.println(tab.length);
        tab[3] = "Reims";
        for(String ville : tab){
            System.out.println(ville);
        }
    }

}
