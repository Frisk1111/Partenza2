package com.example.linguaggio;

public class Main {


    public static void main(String[] args) {


        String str = "Hello world";
        String str2 = "Hello world 2";

        BiContenitore<String, String> cq = new BiContenitore<>(str, str2);


        System.out.println(cq);

    }
}
