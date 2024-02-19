package dia10;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		// o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		// números digitados, que sejam positivos.

		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		// o número zero seja digitado.
		// 1º variáveis

		int totalPositivos = 0;
		int numero = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			if (numero > 0) {
				totalPositivos = totalPositivos + numero; // o que ele já tinha + o valor novo
			}

		} while (numero != 0);
		System.out.println(" A soma dos números positivos é: " + totalPositivos);
	}

}
