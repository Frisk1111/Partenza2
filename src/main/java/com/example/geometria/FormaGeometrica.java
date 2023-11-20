package com.example.geometria;

public abstract class FormaGeometrica implements Misurabile{


    public double area() {
        return 0.0;
    }


    public double perimetro() {
        return 0.0;
    }

    public double semiperimetro(){


        return perimetro()/ 2;
    }
}
