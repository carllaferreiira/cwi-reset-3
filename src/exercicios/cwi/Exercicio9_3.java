package exercicios.cwi;

import java.util.Scanner;

public class Exercicio9_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota = 0;
		System.out.println("Nos de uma nota de 0 á 10 quanto satisfeito você ficou com esse programa:");

		do {
			nota = scan.nextDouble();

			if (nota <= 6) {
				System.out.println("A nota informada foi: " + nota
						+ ". Vamos procurar melhorar, nos conte mais o que não foi legal pra você:");
			} else if (nota >= 8 && nota <= 10) {
				System.out.println(" A nota informada foi: " + nota
						+ ". Estamos no caminho de oferecer um programa que esteja a altura de suas necessidades, nos conte o que podemos melhorar:");

			} else { // nota > 10

				System.out.println("Nota não válida, tente novamente:");

			}

		} while (nota > 10);
}
}