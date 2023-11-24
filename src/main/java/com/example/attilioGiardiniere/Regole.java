package com.example.attilioGiardiniere;

public enum Regole {

    si(1.0),
    no(0.0),


    SI(si),
    NO(no),
    PIU(si),
    MENO(-1.0),
    META(0.5),
    METAMENO(-0.5);


    private double moltiplicatore = 1.0;

    Regole(double moltiplicatore) {
        this.moltiplicatore = moltiplicatore;
    }


    /*
    * consente di accedere alle variabili
    * alle regole
    */
    private Regole(Regole regola){
        this.moltiplicatore = regola.moltiplicatore;
    }


    public double apply(Double value){

        return value * this.moltiplicatore;
    }



}
