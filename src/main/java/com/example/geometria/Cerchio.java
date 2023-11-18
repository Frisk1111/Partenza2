package com.example.geometria;

public class Cerchio extends FormaGeometrica {


    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }


    @Override
    public double area() {

        return raggio * raggio * Math.PI;
    }

    @Override

    public double perimetro() {
        return 2 * raggio * Math.PI;
    }


    @Override
    public double semiperimetro() {


        return perimetro() / 2;
    }


    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
}
