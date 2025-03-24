package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {

        // Tests de vérification

        verifier(3, 1, 8, true);

        verifier(3, 1, 9, false);

        verifier(3, 2, 10, true);

        verifier(3, 2, 8, true);

        verifier(3, 2, 9, false);

        verifier(6, 1, 11, true);

        verifier(6, 0, 11, false);

        verifier(1, 4, 11, true);

        verifier(0, 3, 10, true);

        verifier(1, 4, 12, false);

        verifier(3, 1, 7, true);

        verifier(1, 1, 7, false);

    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int big = nbBig;
        int small = nbSmall;
        int wall = 0;
        boolean resultat = false;
        if(big*5+small < longueur) return false;
        while(!resultat || (big != 0 && small !=0)){
            if(wall + 5 <= longueur && big>0){
                wall+=5;
                big--;
            }else if(wall + 1 <= longueur && small >0) {
                wall += 1;
                small--;
            } else return false;
            if(wall == longueur) resultat = true;
        }
        return resultat;

    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {

        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {

            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");

        }

    }
}
