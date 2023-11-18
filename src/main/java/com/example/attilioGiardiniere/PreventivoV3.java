package com.example.attilioGiardiniere;


import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;

import java.math.BigDecimal;

public class PreventivoV3 {

    /*
    due quadrati e quattro cerchi con siepi di raggio cinque,
    fare array
    - poi forma non definita di area 55 e di perimetro
     */

    private Cerchio[] cerchi;
    private Quadrato[] quadrati;

    private int numeroCerchi;
    private int numeroQuadrati;

    private final BigDecimal valoreUnitarioPrato;
    private final BigDecimal valoreUnitarioSiepe;
    private BigDecimal totaleCostoSiepe = BigDecimal.ZERO;
    private BigDecimal totaleCostoPrato = BigDecimal.ZERO;

    public PreventivoV3(BigDecimal valoreUnitarioPrato, BigDecimal valoreUnitarioSiepe) {
        this.valoreUnitarioPrato = valoreUnitarioPrato;
        this.valoreUnitarioSiepe = valoreUnitarioSiepe;
        this.cerchi = new Cerchio[]{};
        this.quadrati = new Quadrato[]{};
    }


    public void addCerchio(Cerchio cerchio) {

        numeroCerchi++;


        if (numeroCerchi > 4) {

            System.out.println("Ci sono già quattro cerchi!");
        }
        if (cerchio == null) {
            System.out.println("IL CERCHIO é NULLO! NON VA BENE");
        }
        cerchi = new Cerchio[]{cerchio};


    }


    public void removeCerchio(int index) {


        for (Cerchio cerchio1 : cerchi) {

            numeroCerchi--;


            cerchio1 = cerchi[index];
            cerchi[index] = null;

        }

        System.out.println(String.format("Numero cerchi: %d", numeroCerchi));


    }

    public void removeQuadrato(int index) {


        for (Quadrato quadrato : quadrati) {

            numeroQuadrati--;


            quadrato = quadrati[index];
            quadrati[index] = null;

        }

        System.out.println(String.format("Numero lampadine: %d", numeroCerchi));


    }


    public void addQuadrato(Quadrato quadrato) {

        numeroQuadrati++;
        if (numeroQuadrati > 2) {

            System.out.println("Ci sono già 2 quadrati!");
        }
        quadrati = new Quadrato[]{quadrato};


    }

}
