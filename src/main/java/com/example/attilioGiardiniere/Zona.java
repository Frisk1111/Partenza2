package com.example.attilioGiardiniere;

import com.example.geometria.Misurabile;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zona implements Misurabile {


//    private static final Logger logger = LogManager.getLogger("HELLO WORLD");

    private List<Zona> zone = new ArrayList<>();

    private String descrizione;
    private Double area;
    private Double perimetro;

    private double totArea = 0.0;
    private double totPerimetro = 0.0;

    private Misurabile forma;

    public Zona(String descrizione, Misurabile misurabile) {
        this.perimetro = misurabile.perimetro();
        this.area = misurabile.area();
        this.forma = misurabile;
    }

    public Zona(String descrizione, Double area, Double perimetro) {
        this.descrizione = descrizione;
        this.area = area;
        this.perimetro = perimetro;
    }


    public Zona(String descrizione, Double area) {
        this.descrizione = descrizione;
        this.area = area;
    }

    @Override
    public double perimetro() {

        return this.perimetro;

    }

    @Override
    public double area() {

        return this.area;

    }

    public static final Zona fromArea(String descrizione, double area) {

        return new Zona(descrizione, area);
    }

    public static final Zona fromPerimetro(String descrizione, double perimetro) {

        return new Zona(descrizione, perimetro);
    }

    public double addArea(double area) {

        return this.area = area;

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

        for (Misurabile misurabile : zone) {
            System.out.println(index++ + " " + misurabile);

        }

    }


}
