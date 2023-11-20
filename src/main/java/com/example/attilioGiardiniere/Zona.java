package com.example.attilioGiardiniere;

import com.example.geometria.Misurabile;

import java.util.ArrayList;
import java.util.List;

public class Zona implements  Misurabile {


    private List<Misurabile> misurabili = new ArrayList<>();

    private String descrizione;
    private Double area;
    private Double perimetro;

    public Zona(String descrizione) {
        this.descrizione = descrizione;
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

    public static final Zona fromArea(String descrizione, double area){

        return new Zona(descrizione, 0.0);
    }

    public static final Zona fromPerimetro(String descrizione, double area){

        return new Zona(descrizione, 0.0);
    }

    public double addArea(double area) {

        return this.area = area;

    }

    void getDescrizione(String descrizione) {

        this.descrizione = descrizione;

    }

    void addMisurabile(Misurabile misurabile) {


    }

    void remove(Integer index) {

    }


    void printList() {


    }


}
