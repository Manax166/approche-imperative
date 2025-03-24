package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String array = "aaabbcVVVVVao";
        String consecutif = "";
        char actualChar = array.charAt(0);
        int count = 0;
        for (char val : array.toCharArray()) {
            if (val == actualChar) count++;
            else {
                consecutif += ""+ actualChar + count;
                actualChar = val;
                count =1;
            }
        }
        consecutif += ""+actualChar + count;
        System.out.println(consecutif);
    }
}
