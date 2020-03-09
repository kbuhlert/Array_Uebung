package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] feld = new int[] {1,2,3,4,5};    //array wurde deklariert und initialisiert

        //alternative Variante
        int[] feld2 = new int[5];
        feld2[0] = 1;
        feld2[1] = 2;
        feld2[2] = 3;
        feld2[3] = 4;
        feld2[4] = 5;

        //Ausgabe des Arrays
        System.out.println(feld[0]);
        System.out.println(feld[1]);
        System.out.println(feld[2]);
        System.out.println(feld[3]);
        System.out.println(feld[4]);

        //Setzte drittes Arrayelement auf den Wert 2 und drucke Methdoe aus
        feld[2] = 2;
        printFeld5(feld);

    }

    //Methode die den Array ausgibt
    public static void printFeld5 (int[] feldi){
        System.out.println(feldi[0]);
        System.out.println(feldi[1]);
        System.out.println(feldi[2]);
        System.out.println(feldi[3]);
        System.out.println(feldi[4]);
        System.out.println(feldi);
    }
}
