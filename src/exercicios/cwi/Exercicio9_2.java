package exercicios.cwi;

import java.util.Scanner;

public class Exercicio9_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe n�mero inicial: ");
		int valorInicial = scan.nextInt();

		boolean valorFinalMaiorQueInicial = false;
		int valorFinal = 0;
		do {
			System.out.println("Informe o n�mero final: ");
			valorFinal = scan.nextInt();
			if (valorFinal > valorInicial) {
				valorFinalMaiorQueInicial = true;
			} else {
				System.out.println("O n�mero final precisa ser maior que o inicial.");
			}
		} while (!valorFinalMaiorQueInicial);

		for (int i = valorInicial; i <= valorFinal; i++) {
			System.out.println(i);
		}

	}
}
