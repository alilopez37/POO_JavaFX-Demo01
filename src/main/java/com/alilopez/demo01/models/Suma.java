package com.alilopez.demo01.models;

public class Suma {
    private int numero1;
    private int numero2;


    public Suma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar(){
        return numero1 + numero2;
    }
}
