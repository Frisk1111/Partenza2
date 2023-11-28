package com.example.attilioGiardiniere;

import com.example.geometria.Misurabile;

import java.util.ArrayList;
import java.util.List;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class Zona implements Misurabile {


//    private static final Logger logger = LogManager.getLogger("HELLO WORLD");

    private List<Zona> zone = new ArrayList<>();

    private String descrizione;

    private double totArea = 0.0;
    private double totPerimetro = 0.0;



    public Zona(String descrizione, Misurabile misurabile) {

        /*
        *  così richiamiamo il costruttore !!
        */
        this(descrizione, misurabile.area(), misurabile.perimetro());
//        this.totPerimetro = misurabile.perimetro();
//        this.totArea = misurabile.area();

    }

    public Zona(String descrizione, Double area, Double perimetro) {
        this.descrizione = descrizione;
        this.totArea = area;
        this.totPerimetro = perimetro;
    }


    public Zona(String descrizione, Double area) {
        this.descrizione = descrizione;
        this.totArea = area;
    }

    @Override
    public double perimetro() {

        return this.totPerimetro;

    }

    @Override
    public double area() {

        return this.totArea;

    }



    public static final Zona fromArea(String descrizione, double area) {

        return new Zona(descrizione, area);
    }

    public static final Zona fromPerimetro(String descrizione, double perimetro) {

        return new Zona(descrizione, perimetro);
    }

    public double addArea(double area) {

        return this.totArea += area;

    }

    public void getDescrizione(String descrizione) {

        this.descrizione = descrizione;

    }

    public void add(String descrizione, Misurabile misurabile) {

        zone.add(new Zona(descrizione, misurabile));

    }


    public void add(Misurabile misurabile, Regole regolaPerimetro, Regole regolaArea) {

        zone.add(new Zona("", misurabile));


        totPerimetro = totPerimetro + regolaPerimetro.apply(misurabile.perimetro());
        totArea = totArea + regolaArea.apply(misurabile.area());


    }

    public void add(Zona forma) {

        zone.add(forma);


    }

    public void remove(Integer index) {
        Misurabile oggetto = zone.get(index);
      zone.remove(oggetto);
        zone.set(index, null);
    }


    public void printList() {

        int index = 0;


        StringBuilder sb = new StringBuilder();
        for (Misurabile misurabile : zone) {

            sb.append("elemento ");


            sb.append(++index);
            sb.append(": ");
            sb.append(misurabile.toString());



            System.out.println(sb);

        }

    }


}
