package com.example.linguaggio;

public class BiContenitore<TIPO1, TIPO2> {

    private TIPO1 contenuto;
    private TIPO2 contenuto2;

    public BiContenitore(TIPO1 contenuto, TIPO2 contenuto2) {
        this.contenuto = contenuto;
        this.contenuto2 = contenuto2;
    }


    public TIPO1 getContenuto() {
        return contenuto;
    }

    public TIPO2 getContenuto2() {
        return contenuto2;
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("BiContenitore [ contenuto= ");
        builder.append(contenuto);
        builder.append(", contenuto2 = ");
        builder.append(contenuto2);
        builder.append(" ]");
        return builder.toString();


    }
}
