package com.programacion;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Almacen inv = new Almacen();
        String producto = JOptionPane.showInputDialog("Inserta o nome do producto:");
        int nVentas = Integer.parseInt(JOptionPane.showInputDialog("Inserta o número de ventas:"));
        inv.inventario(producto,nVentas);
    }
}
