package dia10;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		// menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa.

		// Entrada e Saída de dados
		// Operadores
		// Laços Condicionais ( if e else)
		// Laço de Repetição WHILE

		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela:
		// 1º declarar as variáveis

		int idade = 0;
		int total21 = 0;
		int total50 = 0;
		Scanner ler = new Scanner(System.in);

		// cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior
		// que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		// 2º criar a condição/logica

		while (idade >= 0) {
			System.out.println(" Digite a idade: ");
			idade = ler.nextInt();

			if (idade < 21 && idade >= 0) {
				total21++; // total21 = total21 + 1;
			}
			if (idade > 50) {
				total50++; // total50 = total50 + 1;
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + total21);
		System.out.println("Total de pessoas maiores de 50 anos: " + total50);
	}

}
