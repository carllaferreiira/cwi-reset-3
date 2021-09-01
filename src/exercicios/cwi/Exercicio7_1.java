package exercicios.cwi;

import java.util.Scanner;

public class Exercicio7_1 {

			  public static void main(String[] args) {
			    //Lê a partir da linha de comando
			    Scanner scan = new Scanner(System.in);
			    
			    System.out.println("Digite o primeiro número");
		         int respostaPrimeiroNumero = scan.nextInt();
		     
		         System.out.println("Digite o segundo número");
		         int respostaSegundoNumero = scan.nextInt();
		         int soma = respostaPrimeiroNumero + respostaSegundoNumero; 
		         
		         System.out.println("O resultado da soma é: " + soma);
	}

}
