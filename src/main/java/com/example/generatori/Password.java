package com.example.generatori;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Password {


    private String lettereMinuscole = "qwertyuiopasdfghjklzxcvbnm";
    private String lettereMaiuscole = lettereMinuscole.toUpperCase();

    private List<String> lista = new ArrayList<>();
    private String numeri = "0123456789";

    private String caratteriSpeciali = "@?*[]%";

    private String caratteri = caratteriSpeciali + numeri + lettereMaiuscole + lettereMinuscole;


    public String genera(int lunghezza) {

        //creo il random
        Random random = new Random();
        //creo l'index che ha come lunghezza quella della lista!
        int index = lista.size();


        for (int i = 0; i < caratteri.length(); i++) {

            /*
            Faccio questo per mettere ogni singolo CARATTERE dentro la lista!
            Visto che mi servono i CARETTERI singoli per fare la password
             */
            lista.add(String.valueOf(caratteri.charAt(i)));
        }

        /*
        Primo. Creo l'index2 e gli faccio fare l'operazione tra il random e l'index di prima
        Secondo. Metto come clausola che index è minore della lunghezza d'input
        Terzo. Faccio aumentare la index2
        Quarto. Creo uno string builder
        Quinto. Faccio l'append e ci appendo la lista che PRENDE un numero RANDOM tra la lunghezza di lista!
         */

        StringBuilder str = new StringBuilder();
        for (int index2 = random.nextInt() * index; index2 < lunghezza; index2++) {




            str.append(lista.get(random.nextInt(lista.size())));


        }

        return str.toString();
    }


    public String getLettereMinuscole() {
        return lettereMinuscole;
    }

    public void setLettereMinuscole(String lettereMinuscole) {
        this.lettereMinuscole = lettereMinuscole;
    }

    public String getLettereMaiuscole() {
        return lettereMaiuscole;
    }

    public void setLettereMaiuscole(String lettereMaiuscole) {
        this.lettereMaiuscole = lettereMaiuscole;
    }

    public String getNumeri() {
        return numeri;
    }

    public void setNumeri(String numeri) {
        this.numeri = numeri;
    }

    public String getCaratteriSpeciali() {
        return caratteriSpeciali;
    }

    public void setCaratteriSpeciali(String caratteriSpeciali) {
        this.caratteriSpeciali = caratteriSpeciali;
    }
}
