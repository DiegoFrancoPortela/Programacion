package com.programacion;

public class Circulo {

    private double radio;
    private final double Pi = 3.14;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Pi * Math.pow(radio,2);
    }

    public double calcularLonxitude(){
        return 2 * Pi * radio;
    }
}
