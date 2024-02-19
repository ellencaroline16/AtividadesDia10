package dia10;

import java.util.Scanner;

public class ExercicioFOR1 {

	public static void main(String[] args) {

		// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado:
		// onde o primeiro número deve ser menor do que o segundo número. Caso
		// contrário, deve
		// ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		// do programa.
		// No intervalo informado, mostre na tela todes os números que são múltiplos de
		// 3 e 5

		// O que devo usar: Entrada e Saída de dados - (scanner e sysout) - Laços
		// Condicionais (if e else)
		// - Laço de Repetição FOR

		// 1º declaro as variáveis

		// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado:
		int numero1 = 0;
		int numero2 = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println(" Insira o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.println(" Insira o segundo número: ");
		numero2 = ler.nextInt();

		//2º Criar a condição/lógica
		
		// onde o primeiro número deve ser menor do que o segundo número.
		// Caso contrário, deve
		// ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		// do programa.

		if (numero2 <= numero1) {
			System.out.println(" O intervalo é inválido.");
		} else {
			// o else é o oposto do if
			// comecei com o valor inicial(contador), vou repetir de 1 em 1 até o valor final(limite), e o ++ incremental
			for (int contador = numero1; contador <= numero2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}

		}

	}

}
