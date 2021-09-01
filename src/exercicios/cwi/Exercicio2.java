package exercicios.cwi;

import java.util.Scanner;

public class Exercicio2 {
		
		 public static void main(String[] args) {
			    //Lê a partir da linha de comando
			    Scanner scan = new Scanner(System.in);
			    
			    System.out.println("Digite sua nota 1");
		         int respostaPrimeiraNota = scan.nextInt();
		         
		         System.out.println("Digite sua nota 2");
		         int respostaSegundaNota = scan.nextInt();
		         
		         System.out.println("Digite sua nota 3");
		         int respostaterceiraNota = scan.nextInt();
		         
		         System.out.println("Digite sua nota 4");
		         int respostaQuartaNota = scan.nextInt();
		         
		         int soma = respostaPrimeiraNota + respostaSegundaNota + respostaterceiraNota + respostaQuartaNota;  
		         
		         double divisão = soma / 4.0;
		         System.out.println("A média da nota é: " + divisão);

	}

}

