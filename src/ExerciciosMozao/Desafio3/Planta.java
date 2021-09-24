package ExerciciosMozao.Desafio3;

// Isso é uma CLASSE
public class Planta {

	// Esses são ATRIBUTOS de classe
	private String nomePlanta;
	private String floricultura;
	private float nivelInteresse;
	private float preco;
	private float frete;
	private String localizacao;
	// Fim dos ATRIBUTOS

	// Isso é um CONSTRUTOR com parâmetros
	public Planta(String nomePlanta, String floricultura, float nivelInteresse, float preco, float frete,
			String localizacao) {
		this.setNomePlanta(nomePlanta);
		this.setFloricultura(floricultura);
		this.setNivelInteresse(nivelInteresse);
		this.setPreco(preco);
		this.setFrete(frete);
		this.setLocalizacao(localizacao);
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
	public void setNomePlanta(String nomePlanta /*Isso é um ATRIBUTO do método*/) {
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

	public float getNivelInteresse() {
		return nivelInteresse;
	}

	public void setNivelInteresse(float nivelInteresse) {
		this.nivelInteresse = nivelInteresse;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float d) {
		this.preco = d;
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
	public void mostrarOrcamento() {

		System.out.println("ORÇAMENTO 1 PLANTINHA:");
		System.out.println("Nome Planta: " + this.getNomePlanta());
		System.out.println("Floricultura: " + this.getFloricultura());
		System.out.println("Nivel Interesse: " + this.getNivelInteresse());
		System.out.println("Preco: " + this.getPreco());
		System.out.println("Frete: " + this.getFrete());
		System.out.println("Localizacao: " + this.getLocalizacao());
	}
	// Fim dos MÉTODOS
}

