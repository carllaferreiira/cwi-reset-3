package exercicios.cwi;

import java.util.Scanner;

public class Exercicio8_2 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {

			System.out.println("Coloque um n�mero:");
			numero = scan.nextInt();

			if (numero > maior) {
				maior = numero;
			}
			System.out.println("O maior n�mero informado foi " + maior);
		}
	}
}
