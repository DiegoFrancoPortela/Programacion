package com.programacion;

import javax.swing.JOptionPane;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Metodos met = new Metodos();
        int soldo, traballadores=0, baixo=0;
        float porcentaxe;
        soldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce o soldo:"));
        while (soldo != 0){
            traballadores++;
            if (met.Salario(soldo)==false){
                baixo++;
            }
            soldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce outro soldo"));
        }
        porcentaxe=baixo*100/traballadores;
        JOptionPane.showMessageDialog(null,"O "+porcentaxe+"% dos traballadores ten un soldo inferior a 1000", "Titulo",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
