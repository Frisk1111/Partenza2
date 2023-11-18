package com.example.geometria;

public class Esecutore {


    public static void main(String[] args) {



        Quadrato quadrato = new Quadrato(2);

        System.out.println("\n / ------------------------------ / \n");


        System.out.println("\n area quadrato: " + quadrato.area());
        System.out.println("\n perimetro quadrato: " + quadrato.perimetro());


        System.out.println("\n / ------------------------------ / \n");


        Rettangolo rettangolo = new Rettangolo(4, 5);

        double areaRettangolo = rettangolo.area();
       double perimetroRettangolo = rettangolo.perimetro();




        System.out.println("\n area rettangolo: " + areaRettangolo);
        System.out.println("\n perimetro rettangolo: " + perimetroRettangolo);
        System.out.println("\n / ------------------------------ / \n");



        Cerchio cerchio = new Cerchio(4);
        System.out.println("area cerchio: " + cerchio.area());




        System.out.println("\n perimetro cerchio: " + cerchio.perimetro());



        System.out.println("\n / ------------------------------ / \n");


        Ellisse ellisse = new Ellisse( 2, 3);



        System.out.println("\n perimetro ellisse: " + ellisse.perimetro());
        System.out.println("\n area ellisse: " + ellisse.area());



        System.out.println("\n ---------------------------------------- \n");


        Contatore contatore = new Contatore(1);




        contatore.conta();
    }


}
