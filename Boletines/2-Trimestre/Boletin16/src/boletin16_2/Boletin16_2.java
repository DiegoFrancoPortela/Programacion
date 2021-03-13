package boletin16_2;

import javax.swing.JOptionPane;

public class Boletin16_2 {
    public static void main(String[] args) {
        Metodos2 met = new Metodos2();
        met.engadirAltura();
        float alturaMedia = met.mediaAltura();
        JOptionPane.showMessageDialog(null,"A altura media é: "+alturaMedia);
    }
}
