package ExerciciosMozao.Desafio4;

import java.util.Calendar;
import java.util.Date;


public class Planta {

	private String nomePlanta;
	private String floricultura;
	private int nivelInteresse;
	private float preco;
	private float frete;
	private String localizacao;
	private int diaDComprarPlanta;

	// Fim dos ATRIBUTOS

	// Isso � um CONSTRUTOR com par�metros
	public Planta(String nomePlanta, String floricultura, int nivelInteresse, float preco, float frete,
			String localizacao, int diaDComprarPlanta) {
		this.setNomePlanta(nomePlanta);
		this.setFloricultura(floricultura);
		this.setNivelInteresse(nivelInteresse);
		this.setPreco(preco);
		this.setFrete(frete);
		this.setLocalizacao(localizacao);
		this.setDiaDComprarPlanta(diaDComprarPlanta);
	}
	// Fim do CONSTRUTOR com par�metros

	// Isso � um CONSTRUTOR padr�o (sem par�metros)
	public Planta() {
	}
	// Fim do CONSTRUTOR padr�o

	// Esses s�o M�TODOS
	public String getNomePlanta() {
		return nomePlanta;
	}

	// Este m�todo n�o retorna nada (void)
	public void setNomePlanta(String nomePlanta /* Isso � um ATRIBUTO do m�todo */) {
		// O "this." se refere � pr�pria classe
		this.nomePlanta = nomePlanta;
	}

	// Este m�todo espera um retorno do tipo String
	public String getFloricultura() {
		return floricultura;
	}

	public void setFloricultura(String floricultura) {
		this.floricultura = floricultura;
	}

	public int getNivelInteresse() {
		return nivelInteresse;

	}

	public int setNivelInteresse(int nivelInteresse) {
		return this.nivelInteresse = nivelInteresse;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(float frete) {
		this.frete = frete;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getDiaDComprarPlanta() {
		return diaDComprarPlanta;
	}

	public void setDiaDComprarPlanta(int diaDComprarPlanta) {
		this.diaDComprarPlanta = diaDComprarPlanta;

	}

	public int retornarDiaHoje() {
		Date data = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		int diaHoje = calendario.get(Calendar.DAY_OF_MONTH);
		return diaHoje;

		// return calendario.get(Calendar.DAY_OF_MONTH); /* Vers�o equivalente */
	}

	public void mostrarOrcamento() {

		System.out.println("OR�AMENTO 1 PLANTINHA:");
		System.out.println("Nome Planta: " + this.getNomePlanta());
		System.out.println("Floricultura: " + this.getFloricultura());
		System.out.println("Nivel Interesse: " + this.getNivelInteresse());
		System.out.println("Preco: " + this.getPreco());
		System.out.println("Frete: " + this.getFrete());
		System.out.println("Localizacao: " + this.getLocalizacao());
		System.out.println("Dia de Comprar Planta: " + this.getDiaDComprarPlanta());

		if (this.getNivelInteresse() == 3) {
			System.out.println("Uma plantinha favorita <3");

			int quantDias = this.getDiaDComprarPlanta() - this.retornarDiaHoje();

			if (quantDias < 0) {
				System.out.println("S� vai comprar m�s que vem a plantinha baga�a!");
			} else if (quantDias == 0) {
				System.out.println(
						"O moz�o ficou louco abriu a carteira mas � tipo lobisomem s� at� hoje plantinha ate dizer chega!");
			} else if (quantDias == 1) {
				System.out.println("Amanh� � o Dia D e vai ser na Hora H que vou comprar plantinha ");
			} else {
				System.out.println("Vou comprar daqui a " + quantDias + " dias!");
			}

		}

	}
}
