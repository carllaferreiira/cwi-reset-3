import java.util.Scanner;

public class Listagem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto:");
		while(sc.hasNext()){
			i++;
			System.out.println("Token: "+sc.next());
		}
		
sc.close(); //Encerra o programa
	}

}
