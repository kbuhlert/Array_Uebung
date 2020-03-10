package com.company;

import java.util.Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

        // 2 dimensionale arrays (array in array, Zeilen und Spalten)
        int[][]feld2dim = new int[3][4];

        //einem Element etwas zuweisen
        feld2dim[1][2] = 42;

        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));

        //es gibt eine Hilfsmethode die ein array ausgibt
        System.out.println("---");
        System.out.println(Arrays.toString(feld));

        //andere Initialisierung (Zeilenweise)
        int[][]feld2dim2 = new int [][]{{1,2,3},{4,5,6}}; //Array hat 2 Zeilen und 3 Spalten
        System.out.println("---");
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));

        //auf die Schnelle noch etwas zum Thema String
        System.out.println("---");
        String begrüßung = "Hallo Zam!";
        System.out.println(begrüßung.length()); //mit . werden Methoden für String aufgerufen. Mit length z.B die Zahl der Zeichen
        //Strings dürfen nicht mit == verglichen werden, sondern können mit der Methode "equals" verglichen werden
        System.out.println(begrüßung.equals("Hallo")); // liefert boolean true wenn die Zeichen exakt gleich sind, Anwendungsbsp: Passwortabfrage

    }//Ende der Main-Methode

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
