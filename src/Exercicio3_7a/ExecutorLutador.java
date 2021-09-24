package Exercicio3_7a;

public class ExecutorLutador {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Chinbinha", "BR", 24, 170f, 63f, 4, 1, 0);
		l[0].status();

		l[1] = new Lutador("Cachaca", "BR/RS", 57, 173, 70, 5, 0, 2);
		l[0].status();

		l[2] = new Lutador("Pretty Boy", "FRA", 31, 175f, 68.9f, 11, 2, 1);
		l[0].status();

		l[3] = new Lutador("Yoda", "BR/RS", 57, 173, 55, 5, 0, 2);
		l[0].status();

		l[4] = new Lutador("Chubaca", "BR/RS", 57, 173, 110, 5, 0, 2);
		l[0].status();

		l[5] = new Lutador("Apagador", "BR/RS", 57, 173, 90, 5, 0, 2);
		l[0].status();
		

	}

}
