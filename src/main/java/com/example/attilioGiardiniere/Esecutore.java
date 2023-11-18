package com.example.attilioGiardiniere;


import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Esecutore {

    public static void main(String[] args) {


        Cerchio cerchio = new Cerchio(3.5);
        Quadrato quadrato = new Quadrato(7.80);
        Rettangolo rettangolo = new Rettangolo(4, 7);


        PreventivoV1 preventivoV1 = new PreventivoV1(15, 8, cerchio, quadrato, rettangolo);


        System.out.println("\n   --- costo preventivo --- " + costoTotale());



        System.out.println("\n COSTO TOTALE: " + preventivoV1.costoTot());

    }


    public static double costoTotale(){
        Cerchio cerchio = new Cerchio(3.5);
        Quadrato quadrato = new Quadrato(7.80);
        Rettangolo rettangolo = new Rettangolo(4, 7);


        PreventivoV11 preventivoV11 = new PreventivoV11(15, 8);

        return (preventivoV11.perimetro(cerchio) * 2)
                + preventivoV11.areaPrato(quadrato)
                + (preventivoV11.areaPrato(rettangolo) * 2)
                + preventivoV11.perimetro(rettangolo) ;



    }


}
