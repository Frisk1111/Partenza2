package com.example.attilioGiardiniere;


import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class PreventivoV1 {


    /*
     Calcolare a METRI
     */
    private int costoSiepe;

    /*
    Calcolare a METRiQ
     */
    private int costoPrato;

    private Cerchio cerchio;
    private Quadrato quadrato;
    private Rettangolo rettangolo;


    public PreventivoV1(int costoSiepe, int costoPrato, Cerchio cerchio, Quadrato quadrato, Rettangolo rettangolo) {
        this.costoSiepe = costoSiepe;
        this.costoPrato = costoPrato;
        this.cerchio = cerchio;
        this.quadrato = quadrato;
        this.rettangolo = rettangolo;
    }

    public double costoTotSiepe(){




        return 2 * (cerchio.perimetro() * costoSiepe);
    }


    public double costoTotGiardinoQuadrato() {


        return quadrato.area() * costoPrato;
    }

    public double costoTotGiardinoRettangolare() {


        return rettangolo.area() * costoPrato ;
    }


    public double costoTotGiardinoRettangolareConSiepeRettangolare() {


        return (rettangolo.area() + rettangolo.perimetro())* costoPrato ;
    }




    public double costoTotGiardino(){

        return costoTotGiardinoQuadrato() + costoTotGiardinoRettangolare() + costoTotGiardinoRettangolareConSiepeRettangolare();

    }


    public double costoTot(){


        return  costoTotGiardino()+ costoTotSiepe();
    }









}
