package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
	    int numero = sc.nextInt();

	    if (numero >= 0) {
            System.out.println("O número introducido \""+numero+"\" é positivo");
        }

    }
}
