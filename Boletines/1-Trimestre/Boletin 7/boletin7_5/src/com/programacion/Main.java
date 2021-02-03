package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce o primeiro número");
	    double numero1 = sc.nextDouble();
        System.out.println("Introduce o segundo número");
	    double numero2 = sc.nextDouble();
        System.out.println("Introduce o terceiro número");
	    double numero3 = sc.nextDouble();

	    if (numero1 == numero2) {
            System.out.println("Os números deben de ser distintos");
        } else if (numero2 == numero3){
            System.out.println("Os números deben de ser distintos");
        } else if (numero3 == numero1) {
            System.out.println("Os números deben de ser distintos");
        } else if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("O número maior é: " + numero1);
            } else {
                System.out.println("O número maior é: " + numero3);
            }
        } else if (numero2 > numero3) {
            System.out.println("O número maior é: " + numero2);
        } else {
            System.out.println("O número maior é: " + numero3);
        }
    }
}
