package com.programacion;

/*
Crea un algoritmo que cambie de euros a dólares.O cambio pídese por teclado.
(Para codificar este programa inicializa a base ao valor 4, e a altura ao valor 3)
Codifica este programa nun proxecto chamado boletin2_3
*/

public class Main {

    public static void main(String[] args) {
	double euros = 10;
	double cambio = 1.18;
	double dolares = euros*cambio;
	System.out.println(euros+" euros son "+dolares+" dolares.");
    }
}
