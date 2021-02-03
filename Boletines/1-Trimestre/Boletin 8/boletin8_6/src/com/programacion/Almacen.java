package com.programacion;

public class Almacen {

    public void inventario (String producto, int nVentas){
        System.out.println("Introduce un producto e a sua cantidade de ventas");
        System.out.print("O producto "+producto+" ten un rango de ventas: ");
        if (nVentas <= 100){
            System.out.println("baixo");
        }else if (nVentas<=500){
            System.out.println("medio");
        }else if (nVentas<=1000){
            System.out.println("alto");
        }else System.out.println("de primeira necesidade");
    }
}
