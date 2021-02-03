package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce o nome da primeira persoa: ");
	    String nome = sc.next();
        System.out.println("Ahora introduce o peso da primeira persoa: ");
	    double peso1 = sc.nextDouble();

        System.out.println("Introduce o nome da segunda persoa: ");
	    String nome2 = sc.next();
        System.out.println("Agora introduce o peso da segunda persoa: ");
	    double peso2 = sc.nextDouble();

	    if (peso1 > peso2){
            System.out.println(nome+" pesa máis que "+nome2);
            double diferenciaPeso1 = peso1 - peso2;
            System.out.println("A diferencia de peso é de "+ diferenciaPeso1);
        } else {
            System.out.println(nome2+" pesa máis que "+nome);
            double diferenciaPeso2 = peso2 - peso1;
            System.out.println("A diferencia de peso é de "+ diferenciaPeso2);

        }
    }
}
