package ExerciciosMozao.Desafio3;

// Isso � uma CLASSE
public class Planta {

	// Esses s�o ATRIBUTOS de classe
	private String nomePlanta;
	private String floricultura;
	private float nivelInteresse;
	private float preco;
	private float frete;
	private String localizacao;
	// Fim dos ATRIBUTOS

	// Isso � um CONSTRUTOR com par�metros
	public Planta(String nomePlanta, String floricultura, float nivelInteresse, float preco, float frete,
			String localizacao) {
		this.setNomePlanta(nomePlanta);
		this.setFloricultura(floricultura);
		this.setNivelInteresse(nivelInteresse);
		this.setPreco(preco);
		this.setFrete(frete);
		this.setLocalizacao(localizacao);
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
	public void setNomePlanta(String nomePlanta /*Isso � um ATRIBUTO do m�todo*/) {
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

		System.out.println("OR�AMENTO 1 PLANTINHA:");
		System.out.println("Nome Planta: " + this.getNomePlanta());
		System.out.println("Floricultura: " + this.getFloricultura());
		System.out.println("Nivel Interesse: " + this.getNivelInteresse());
		System.out.println("Preco: " + this.getPreco());
		System.out.println("Frete: " + this.getFrete());
		System.out.println("Localizacao: " + this.getLocalizacao());
	}
	// Fim dos M�TODOS
}

