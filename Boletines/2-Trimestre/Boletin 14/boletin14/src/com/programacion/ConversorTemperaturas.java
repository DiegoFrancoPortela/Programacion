package com.programacion;

public class ConversorTemperaturas {
    static final int TempConstante = 80;
    double gradosFharenheit;
    double gradosReaumur;

    public double centigradosAFharenheit(float gradosCentigrados) throws TemperaturaErradaExcepcion {
        if (gradosCentigrados < TempConstante) {
            throw new TemperaturaErradaExcepcion("A temperatura introducida debe ser maior que 80");
        }
        gradosFharenheit = (gradosCentigrados * 1.8) + 32;
        return gradosFharenheit;
    }

    public double centigradosAReaumur(float gradosCentigrados) {
        gradosReaumur = (gradosCentigrados / 1.25);
        return gradosReaumur;
    }
}
