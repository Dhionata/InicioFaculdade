package br.com.exerc;

import java.util.Scanner;

public class ddd {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

	int x;

	x = entrada.nextInt();

	if (x == 61) {
	    System.out.println("Brasilia");
	} else if (x == 71) {
	    System.out.println("Salvador");
	} else if (x == 11) {
	    System.out.println("Sao Paulo");
	} else if (x == 21) {
	    System.out.println("Rio de Janeiro");
	} else if (x == 32) {
	    System.out.println("Juiz de Fora");
	} else if (x == 19) {
	    System.out.println("Campinas");
	} else if (x == 27) {
	    System.out.println("Vitoria");
	} else if (x == 31) {
	    System.out.println("Belo Horizonte");
	} else {
	    System.out.println("DDD nao cadastrado");
	}
    }
}