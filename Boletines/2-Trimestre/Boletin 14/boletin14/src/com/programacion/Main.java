package com.programacion;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ConversorTemperaturas cov = new ConversorTemperaturas();
        float gradosCentigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce os grados centígrados"));

        try {
            JOptionPane.showMessageDialog(null,"Temperatura en Fahrenheit: "+cov.centigradosAFharenheit(gradosCentigrados));
            JOptionPane.showMessageDialog(null,"Temperatura en Reaumur: "+cov.centigradosAReaumur(gradosCentigrados));
        } catch (TemperaturaErradaExcepcion error) {
            JOptionPane.showMessageDialog(null,"Error "+ error.toString());
        }
    }
}
