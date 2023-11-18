package com.example.geometria;

public class Quadrato extends FormaGeometrica {


    private double lato1;

    public Quadrato(double lato1) {
        this.lato1 = lato1;
    }

    @Override
    public double area() {

        return lato1 * lato1;

    }

    @Override
    public double perimetro() {

        return (4 * lato1);

    }




    @Override
    public double semiperimetro() {


        return perimetro() / 2;
    }


    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }
}

