package ExerciciosMozao;

public class DesafioMozao2 {

	public double solucao(double[] listaPrecos) {

		double blusinhaBarata = 5000;

		for (int i = 0; i < listaPrecos.length; i++) {
			double blusinha = listaPrecos[i];
			System.out.println(blusinha);
			if (blusinha < blusinhaBarata) {
				blusinhaBarata = blusinha;
			}
		}

		return blusinhaBarata;
	}
}
