package ExerciciosMozao.Desafio3;

public class ExecutorListaPlantas {

	// Este é o método MAIN. Ele é o ponto de partida para rodar aplicações Java.
	public static void main(String[] args) {
		Planta planta1 = new Planta();

		planta1.setNomePlanta("Monstera");
		planta1.setFloricultura("Tuia Azul");
		planta1.setNivelInteresse(3);
		planta1.setPreco(46);
		planta1.setFrete(6);
		planta1.setLocalizacao("Perto");
		planta1.mostrarOrcamento();
		
		Planta planta2 = new Planta("Clorofito", "Vitoria", 3, 5, 5, "Longe");
		planta2.mostrarOrcamento();

	}

}
