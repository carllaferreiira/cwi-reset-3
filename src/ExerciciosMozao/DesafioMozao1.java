package ExerciciosMozao;

public class DesafioMozao1 {
	public int solucao(int[] myArray) {

		// Seu código a partir daqui:
		int maiorTemperatura = -500;
		for (int i = 0; i < myArray.length; i++) {
			int temperaturaAtual = myArray[i];
			System.out.println(temperaturaAtual);
			if (temperaturaAtual > maiorTemperatura) {
				maiorTemperatura = temperaturaAtual;
				
			}
			
		}

	
		return 0;
	}

}
