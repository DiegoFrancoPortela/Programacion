package com.programacion;

public class Main {

    public static void main(String[] args) {
        Coche obx = new Coche();
        //Velocidade Estándar.
        System.out.println("Velocidade Estándar: "+obx.getVelocidade());
        //Velocidade tras acelerar 12.
        obx.acelerar(12);
        System.out.println("Velocidade Acelerando: "+obx.getVelocidade());
        //Velocidade tras frenar 25
        obx.frenar(25);
        System.out.println("Velocidade Frenando: "+obx.getVelocidade());
    }
}
