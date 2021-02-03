package com.programacion;

import javax.swing.*;

public class Figuras {

    private final float Pi = (float) 3.14;
    float cadrado;
    float triangulo;
    float circulo;

    public void Superficie(int seleccion){

        switch (seleccion) {
            case 1 -> {
                float base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base de tu figura"));
                float altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de tu figura (En caso de telo)"));
                cadrado = altura * base;
                System.out.println("A área do teu cadrado é: "+cadrado);
                break;
            }
            case 2 ->  {
                float base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base de tu figura"));
                float altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de tu figura (En caso de telo)"));
                triangulo = (altura * base)/2;
                System.out.println("A área do teu triángulo é: "+triangulo);
                break;
            }
            case 3 ->  {
                float radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce o radio da túa figura"));
                circulo = (float) (Pi * Math.pow(radio,2));
                System.out.println("A área do teu círculo é: "+circulo);
                break;
            }
            default -> System.out.println("Non válido");
        }
    }
}
    

