package com.programacion;

public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion(){
        super();
    }
    public TemperaturaErradaExcepcion(String mensaxeErro){
        super(mensaxeErro);
    }
}
