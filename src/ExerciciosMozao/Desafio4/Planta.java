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

	// Isso é um CONSTRUTOR com parâmetros
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
	// Fim do CONSTRUTOR com parâmetros

	// Isso é um CONSTRUTOR padrão (sem parâmetros)
	public Planta() {
	}
	// Fim do CONSTRUTOR padrão

	// Esses são MÉTODOS
	public String getNomePlanta() {
		return nomePlanta;
	}

	// Este método não retorna nada (void)
	public void setNomePlanta(String nomePlanta /* Isso é um ATRIBUTO do método */) {
		// O "this." se refere à própria classe
		this.nomePlanta = nomePlanta;
	}

	// Este método espera um retorno do tipo String
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

		// return calendario.get(Calendar.DAY_OF_MONTH); /* Versão equivalente */
	}

	public void mostrarOrcamento() {

		System.out.println("ORÇAMENTO 1 PLANTINHA:");
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
				System.out.println("Só vai comprar mês que vem a plantinha bagaça!");
			} else if (quantDias == 0) {
				System.out.println(
						"O mozão ficou louco abriu a carteira mas é tipo lobisomem só até hoje plantinha ate dizer chega!");
			} else if (quantDias == 1) {
				System.out.println("Amanhã é o Dia D e vai ser na Hora H que vou comprar plantinha ");
			} else {
				System.out.println("Vou comprar daqui a " + quantDias + " dias!");
			}

		}

	}
}
