package Aula18;

import java.util.Scanner;

public class BreakeContinue {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Ente com um nuúmero"); int num = scan.nextInt();
		 * 
		 * System.out.println("Ente com um limite");
		 * 
		 * int max = scan.nextInt();
		 * 
		 * for (int i = num; i <= max; i++) { // System.out.println(i); if (i % 7 == 0)
		 * { System.out.println("Valor de i é: " + i); break;
		 * 
		 * } }
		 */

		for (int i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
			System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

			System.out.println("O tamanho do array:" + temperaturas.length);

			System.out.println("Valores do array: ");
		}
	}
}
