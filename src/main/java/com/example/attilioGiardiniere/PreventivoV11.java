package com.example.attilioGiardiniere;


import com.example.geometria.FormaGeometrica;

public class PreventivoV11 {



    /*
     Calcolare a METRI
     */
    private int costoSiepe;

    /*
    Calcolare a METRiQ
     */
    private int costoPrato;


    public PreventivoV11(int costoSiepe, int costoPrato) {
        this.costoSiepe = costoSiepe;
        this.costoPrato = costoPrato;
    }

    public double areaPrato(FormaGeometrica formaGeometrica){




        return formaGeometrica.area() * costoPrato;
    }


    public double perimetro(FormaGeometrica formaGeometrica){




        return formaGeometrica.perimetro() * costoSiepe;
    }




}
