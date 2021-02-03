package com.programacion;

import javax.swing.*;

public class Juego {

    private int numero;
    private int resposta;
    private int intentos;
    public boolean validar = false;
    public boolean acierto = false;

    public void Juego() {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 1 y 50:"));
        if (numero < 0 || numero > 50) {
            JOptionPane.showMessageDialog(null, "El número introducido no es válido");
            boolean validar = false;
        } else {
            validar = true;
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de intentos que tendrá el Jugador 2"));
        }
    }

    public void iniciarJuego() {
        if (validar = true) {
            Juego();
            for (int i = 0; i < intentos; i++) {
                resposta = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2, intente adivinar el número:"));
                if (resposta > numero) {
                    JOptionPane.showMessageDialog(null, "El número es menor que el tecleado.");
                } else if (resposta < numero) {
                    JOptionPane.showMessageDialog(null, "El número es mayor que el tecleado");
                } else {
                    JOptionPane.showMessageDialog(null, "FELICIDADES, has acertado el número!");
                    acierto = true;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Lo siento... Has excedido tus intentos");
        }
    }
}