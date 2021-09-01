package Aula15_8;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7):");

		int diaSemana = scan.nextInt();

		if (diaSemana == 1) {
			System.out.println("Domingo");

		} else if (diaSemana == 2) {
			System.out.println("Segunda-Feira");

		} else if (diaSemana == 3) {
			System.out.println("Ter�a-Feira");
		} else if (diaSemana == 4) {
			System.out.println("Quarta-Feira");
		} else if (diaSemana == 5) {
			System.out.println("Quinta-Feira");

		} else if (diaSemana == 6) {
			System.out.println("Sexta-Feira");

		} else if (diaSemana == 7) {
			System.out.println("Sab�do");

		} else {
			System.out.println("N�o � um dia da semana v�lido");
		}

		
		switch(diaSemana){
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-Feira"); break;
		case 3: System.out.println("Ter�a-Feira"); break;
		case 4: System.out.println("Quarta-Feira"); break;
		case 5: System.out.println("Quinta-Feira"); break;
		case 6: System.out.println("Sexta-Feira"); break;
		case 7: System.out.println("Sab�do"); break;
		default: System.out.println("N�o � um dia da semana v�lido");
		}
		
		
		switch(diaSemana){
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia �til"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("N�o � um dia da semana v�lido");
	}
}
}
