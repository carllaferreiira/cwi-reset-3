package Aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Random rendom = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = rendom.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println("Usando o FOR EACH");
		for (int nota : notas) {
			System.out.println(nota);
			//ex 

		}

	}

}
