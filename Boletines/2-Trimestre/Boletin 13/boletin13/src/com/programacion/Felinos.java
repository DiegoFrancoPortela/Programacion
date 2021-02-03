package com.programacion;

public class Felinos extends Mamifero implements InPodeNadar.IPodeNadar {

    @Override
    public void PodoNadar() {
        System.out.println("Podo nadar");
    }
}
