package com.programacion;

/*
Fai un programa , para o software dunha máquina, que converta una cantidade enteira de diñeiro, que está en billetes
de 100, 20, 5 e moedas de 1 € , no seu equivalente en euros.
( exp.  2 billetes de 100, 3 -> 20 , 6 moedas de 1  visualizaríamos 266 € ).
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero, billetes100, billetes20, billetes5, monedas1;
        int resto100, resto20, resto5;
        System.out.println("Introduce a cantidade de diñeiro:");
        dinero = sc.nextInt();
        billetes100 = dinero/100;
        resto100 = dinero%100;
        billetes20 = resto100/20;
        resto20 = resto100%20;
        billetes5 = resto20/5;
        resto5 = resto20%5;
        monedas1 = resto5/1;

        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Moedas de 1: " + monedas1);
    }
}
