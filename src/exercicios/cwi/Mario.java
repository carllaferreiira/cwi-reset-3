package exercicios.cwi;

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

	/*
	 * public Mario(String n, String o, String e, String f, String c, String b,
	 * String r, String s, String a) { this.nariz = n; this.olhos = o; this.estatura
	 * = e; this.fisico = f; this.cabelos = c; this.bigode = b; this.roupas = r;
	 * this.sapatos = s; this.acessorios = a;
	 * 
	 * }
	 */

	public String getNariz() {
		return this.nariz;
	}

	public void setNariz(String n) {
		this.nariz = n;
	}

	public String getOlhos() {
		return this.olhos;
	}

	public void setOlhos(String o) {
		this.olhos = o;
	}

	public String getEstatura() {
		return this.estatura;
	}

	public void setEstatura(String e) {
		this.estatura = e;

	}

	public String getFisico() {
		return this.fisico;
	}

	public void setFisico(String f) {
		this.fisico = f;
	}

	public String getCabelos() {
		return this.cabelos;
	}

	public void setCabelos(String c) {
		this.cabelos = c;
	}

	public String getBigode() {
		return this.bigode;
	}

	public void setBigode(String b) {
		this.bigode = b;
	}

	public String getRoupas() {
		return this.roupas;
	}

	public void setRoupas(String r) {
		this.roupas = r;
	}

	public String getSapatos() {
		return this.sapatos;
	}

	public void setSapatos(String s) {
		this.sapatos = s;
	}

	public String getAcessorios() {
		return this.acessorios;
	}

	public void setAcessorios(String a) {
		this.acessorios = a;
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
	}

	public void mostrarPoderes() {
		System.out.println("PODERES DE MARIO: ");
		System.out.println("Super força, Super salto, super velocidade");
	}

	public void setEstamina() {
		
		
	}

}
