package exercicios.cwi;
import java.util.Scanner;
public class Exercicio9_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor  da tabuada:");
		int valor = scan.nextInt();

		System.out.println("Tabuada do " + valor);

		for (int i = 1; i <= 10; i++) {
			System.out.println(valor + " X " + i +  " = " + i * valor);

		}
	}

}
