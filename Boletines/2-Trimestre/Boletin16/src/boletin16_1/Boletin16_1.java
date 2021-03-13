package boletin16_1;

import javax.swing.JOptionPane;

public class Boletin16_1 {
    public static void main(String[] args) {
        Metodos met = new Metodos();
        met.engadirNumeros();
        int par = met.numeroPar();
        int impar = met.numeroImpar();
        JOptionPane.showMessageDialog(null,"Numeros Pares: "+par+" || Numeros Impares: "+impar);
    }
}
