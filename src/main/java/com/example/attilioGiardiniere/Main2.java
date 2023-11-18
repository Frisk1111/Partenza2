package com.example.attilioGiardiniere;


import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

import static com.example.attilioGiardiniere.PreventivoV2.no;
import static com.example.attilioGiardiniere.PreventivoV2.si;

public class Main2 {


    public static void main(String[] args) {




        Cerchio cerchio = new Cerchio(3.5);
        Quadrato quadrato = new Quadrato(7.80);
        Rettangolo rettangolo = new Rettangolo(4, 7);


        PreventivoV2 preventivoV2 = new PreventivoV2(8, 15);

        /*
        PRIMI DUE SIEPI A CERCHIO
        IL primo è considera per siepe secondo per prato
         */
        preventivoV2.add(cerchio, si, no);
        preventivoV2.add(cerchio, si, no);
        /*
       PRATO QUADRATO
       IL primo è considera per siepe secondo per prato
         */
        preventivoV2.add(quadrato, no, si);

        /*
        PRATI RETTANGOLARI
        IL primo è considera per siepe secondo per prato
         */
        preventivoV2.add(rettangolo, no, si);

        preventivoV2.add(rettangolo, no, si);

        /*
       PRATO RETTANGOLARE CON SIEPI
       IL primo è considera per siepe secondo per prato
         */

        preventivoV2.add(rettangolo, si, no);


        preventivoV2.stampaTotali();
    }
}
