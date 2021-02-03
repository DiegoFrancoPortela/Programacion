package com.programacion;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("+");
        } else if (numero < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }
}
