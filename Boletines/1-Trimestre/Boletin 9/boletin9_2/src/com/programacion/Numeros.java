package com.programacion;

public class Numeros {

    public void multiplicarNumeros(){
        int i;
        double resultado = 1;

        for (i = 10; i <= 90; i++) {
            resultado = resultado * i;
        }
        System.out.println(resultado);
    }
    
    public void sumarNumeros(){
        int i;
        int resultado = 0;

        for (i = 10; i <= 90; i++) {
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
}
