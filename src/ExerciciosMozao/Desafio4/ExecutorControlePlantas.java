package ExerciciosMozao.Desafio4;

public class ExecutorControlePlantas {

	// Este é o método MAIN. Ele é o ponto de partida para rodar aplicações Java.
	public static void main(String[] args) {
		Planta planta = new Planta();

		planta.setNomePlanta("Monstera");
		planta.setFloricultura("Tuia Azul");
		planta.setNivelInteresse(3);
		planta.setPreco(46);
		planta.setFrete(6);
		planta.setLocalizacao("Perto");
		planta.setDiaDComprarPlanta(22);
		planta.mostrarOrcamento();

	}
}