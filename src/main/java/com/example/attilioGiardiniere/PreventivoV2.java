package com.example.attilioGiardiniere;

import com.example.geometria.FormaGeometrica;
import com.example.geometria.Rettangolo;


import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * Classe realizzata per computare
 * il preventivo di
 * Attilio il giardiniere
 */
public class PreventivoV2 {


    public static final boolean si = true;
    public static final boolean no = false;

    private final BigDecimal valoreUnitarioPrato ;
    private final BigDecimal valoreUnitarioSiepe ;
    private BigDecimal totaleCostoSiepe = BigDecimal.ZERO;
    private BigDecimal totaleCostoPrato = BigDecimal.ZERO;
    private double totPerimetroPerSiepe = 0.0;

    private double totAreaPerPrato = 0.0;



    /*
    Double perché attilio non passerò mai dei big decimal ma dei double!
    Convertisco i double in bigdecimal tramite il costruttore per non far dare errori durante le varie operazioni
     */
    public PreventivoV2(double valoreUnitarioPrato, double valoreUnitarioSiepe) {
        this.valoreUnitarioPrato = new BigDecimal(valoreUnitarioPrato);
        this.valoreUnitarioSiepe = new BigDecimal(valoreUnitarioSiepe);
    }

    /**
     * Aggiungi forme geometriche
     *
     * @param f parametro di tipo FormaGeometrica
     */
    public void add(FormaGeometrica f, boolean consideraPerSiepe, boolean consideraPerPrato) {


       if(consideraPerSiepe){

           //sommo il tot perimetro per il perimetro della formageometrica !
           totPerimetroPerSiepe += f.perimetro();


           //CONVERTISCO IL PERIMETRO IN UN BIGDECIMAL PER FARE LE OPERAZIONI
           BigDecimal perimetro = new BigDecimal(f.perimetro());

           //multiply serve per moltiplicare appunto
           // e moltiplico il perimetro per il prezzo di siepe!
           totaleCostoSiepe = totaleCostoSiepe.add(perimetro.multiply(valoreUnitarioSiepe));

       }


       if(consideraPerPrato){


           totAreaPerPrato += f.area();



           BigDecimal area = new BigDecimal(f.area());

           //aggiungo l'area della forma geometrica
           // che moltiplico per il prezzo di prato
           totaleCostoPrato = totaleCostoPrato.add(area.multiply(valoreUnitarioPrato));

       }
    }

    public BigDecimal totalePreventivo() {
      return  totaleCostoPrato.add(totaleCostoSiepe).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Stampa il risultato del preventivo !
     */
    public void stampaTotali() {


        System.out.println("\n Totale prato da seminare: " + totaleCostoPrato.setScale(2, RoundingMode.HALF_UP) + " €");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n Totale siepe da piantare: " + totaleCostoSiepe.setScale(2, RoundingMode.HALF_UP) + " €");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n Totale preventivo: " + totalePreventivo() + "€");

    }


}
