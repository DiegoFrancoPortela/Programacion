package com.programacion;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Figuras figuras = new Figuras();
        System.out.println("Inserta 1 para calcular a superficie do Cadrado.");
        System.out.println("Inserta 2 para calcular a superficie do Triangulo.");
        System.out.println("Inserta 3 para calcular a superficie do Circulo.");
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Inserta o número da figura:"));
        figuras.Superficie(seleccion);
    }
}
