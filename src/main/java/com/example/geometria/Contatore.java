package com.example.geometria;

public class Contatore {


    private int contatore;
    public Contatore(int valoreIniziale) {

        System.out.println("creazione contatore .. .. .. \n valore iniziale: " + valoreIniziale );


        contatore= valoreIniziale;


    }



    void conta(){


        System.out.println("\n valore aumentato:" + (contatore += 1));
    }
}
