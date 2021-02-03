package com.programacion;

public class CalcularArea {
    float base, altura;
    public CalcularArea(){
    }

    public CalcularArea(float b,float a){
        base = b;
        altura = a;
    }

    public void setBase(float base){
        this.base = base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float calcularArea(){
        return base*altura;
    }
}
