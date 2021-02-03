package com.programacion;

/*
Realiza o ordinograma e,despois codifica un programa que representa un algoritmo, que reciba como dato de entrada o
valor dunha temperatura expresada en graos centígrados e calcule o seu equivalente en graos Fahrenheit e graos Kelvin.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float gradosC, gradosF, gradosK;
        System.out.println("Introduce grados Centígrados:");
        gradosC = sc.nextFloat();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC +" ºC = " + gradosF + " ºF");
        gradosK = gradosC + 273;
        System.out.println(gradosC +" ºC = " + gradosK + " ºK");
    }
}
