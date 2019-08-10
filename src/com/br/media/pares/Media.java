package com.br.media.pares;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Media {
	
	public static void main(String[] args) {

		Scanner scan = entrada();

		int total = 0;
		int controle = 1;
		int divisor = 0;

		List<Integer> numeroImpares = new ArrayList<Integer>();

		while (controle == 1) {
			
			System.out.println("Esconha um numero para o calculo\n "
					+ "Digite 0 para sair ");
			int numero = scan.nextInt();

			if (numero == 0) {

				controle = 0;

			} else if (numero % 2 == 0) {
				divisor++;
				total += numero;
			} else {
				numeroImpares.add(numero);
			}

		}
		
		calculaMedia(divisor, total);
		System.out.println("\nNumeros que não estão na media");
		imprimirLista(numeroImpares);

	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	public static void calculaMedia(int divisor, int total) {
	
		System.out.println("Media entre os numeros pares -> "+ (total / divisor));
	}
	
	public static void imprimirLista(List lista) {
		
		for (Object object : lista) {
			
			System.out.println(object);
		}
		
	}

}
