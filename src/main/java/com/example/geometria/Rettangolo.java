package com.example.geometria;

public class Rettangolo extends FormaGeometrica {


    private int lato1 = 10;

    private int lato2 = 20;


    public Rettangolo(int lato1, int lato2) {
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    @Override
    public double semiperimetro() {


        return perimetro() / 2;
    }


    public int getLato1() {
        return lato1;
    }

    public void setLato1(int lato1) {
        this.lato1 = lato1;
    }

    public int getLato2() {
        return lato2;
    }

    public void setLato2(int lato2) {
        this.lato2 = lato2;
    }


    @Override
    public double area() {

        return lato1 * lato2;

    }


    @Override
    public double perimetro() {

        return (2 * (lato1 + lato2));

    }
}
