package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce o primeiro número: ");
        short numero1 = sc.nextShort();
        System.out.println("Introduce o segundo número ");
        short numero2 = sc.nextShort();

        if (numero1>=numero2){
            System.out.println(numero1-numero2);
        } else {
            System.out.println(numero1+numero2);
        }
    }
}
