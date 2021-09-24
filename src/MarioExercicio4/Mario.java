package MarioExercicio4;

public class Mario {

	private String nariz;
	private String olhos;
	private String estatura;
	private String fisico;
	private String cabelos;
	private String bigode;
	private String roupas;
	private String sapatos;
	private String acessorios;
	private String poderes;
	private int estamina;
	private String nome;
	private int idade;
	private float altura;

	public Mario(String nome, int idade, float altura) {
		this.setNome(nome);
		this.setAltura(altura);
		this.setIdade(idade);
	}

	public Mario() { 
		this.setNome("Mario Bros");
		this.setAltura(1.50f);
		this.setIdade(40);	
		this.setEstamina(100);
	}
	
	/*
	 * public Mario(String n, String o, String e, String f, String c, String b,
	 * String r, String s, String a) { this.nariz = n; this.olhos = o; this.estatura
	 * = e; this.fisico = f; this.cabelos = c; this.bigode = b; this.roupas = r;
	 * this.sapatos = s; this.acessorios = a;
	 * 
	 * }
	 */

	public String getNariz() {
		return nariz;
	}

	public void setNariz(String nariz) {
		this.nariz = nariz;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getFisico() {
		return fisico;
	}

	public void setFisico(String fisico) {
		this.fisico = fisico;
	}

	public String getCabelos() {
		return cabelos;
	}

	public void setCabelos(String cabelos) {
		this.cabelos = cabelos;
	}

	public String getBigode() {
		return bigode;
	}

	public void setBigode(String bigode) {
		this.bigode = bigode;
	}

	public String getRoupas() {
		return roupas;
	}

	public void setRoupas(String roupas) {
		this.roupas = roupas;
	}

	public String getSapatos() {
		return sapatos;
	}

	public void setSapatos(String sapatos) {
		this.sapatos = sapatos;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	public String getPoderes() {
		return poderes;
	}

	public void setPoderes(String poderes) {
		this.poderes = poderes;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void mostrarCaracteristicas() {

		System.out.println("CARACTERISTICAS DE MARIO:");
		System.out.println("Nariz: " + this.getNariz());
		System.out.println("Olhos: " + this.getOlhos());
		System.out.println("Estatura: " + this.getEstatura());
		System.out.println("Fisico: " + this.getFisico());
		System.out.println("Cabelos: " + this.getCabelos());
		System.out.println("Bigode: " + this.getBigode());
		System.out.println("Roupas: " + this.getRoupas());
		System.out.println("Sapatos: " + this.getSapatos());
		System.out.println("Acessorios: " + this.getAcessorios());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Estamina: " + this.getEstamina());
	}

	public void mostrarPoderes() {
		System.out.println("PODERES DE MARIO: ");
		System.out.println("Super força, Super salto, super velocidade");

	}

}
