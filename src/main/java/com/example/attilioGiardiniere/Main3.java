package com.example.attilioGiardiniere;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main3 {

//    private static final Logger logger = LogManager.getLogger(Main3.class);

    public static void main(String[] args) {


        Rettangolo rettangolo = new Rettangolo(10, 20);

        Cerchio cerchio = new Cerchio(10);

        Zona giardino = new Zona("GIardino", rettangolo);

        Quadrato campetto = new Quadrato(10);
        giardino.add(campetto, Regole.no, Regole.MENO);



        giardino.printList();
    }
}
