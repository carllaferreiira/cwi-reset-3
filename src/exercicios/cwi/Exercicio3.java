package exercicios.cwi;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qaul teu valor/hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Qantas horas você trabalha no mês?");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		System.out.println("O valor do salário referente ao mês de setembro é de: " + salario);
		
		
		
	}

}
