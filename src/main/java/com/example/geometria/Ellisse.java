package com.example.geometria;

public class Ellisse extends FormaGeometrica {


    private double semiasseMinore;
    private double semiasseMaggiore;


    public Ellisse(double semiasseMinore, double semiasseMaggiore) {

        this.semiasseMinore = semiasseMinore;
        this.semiasseMaggiore = semiasseMaggiore;
    }


    @Override
    public double area() {

        return Math.PI * semiasseMaggiore * semiasseMinore;
    }

    @Override
    public double perimetro() {

        return 2 * Math.PI * Math.sqrt(Math.pow(semiasseMaggiore, 2) * Math.pow(semiasseMinore, 2) / 2);
    }


    @Override
    public double semiperimetro() {


        return perimetro() / 2;
    }


}

