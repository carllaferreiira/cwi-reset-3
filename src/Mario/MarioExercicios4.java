package Mario;

public class MarioExercicios4 {

	public static void main(String[] args) {
		

	}

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

	private void mostrarCaracteristicas() {

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
		System.out.println("Estamina: " +  this.getEstamina());
	}

	public void mostrarPoderes() {
		System.out.println("PODERES DE MARIO: ");
		System.out.println("Super força, Super salto, super velocidade");
		
		
			 
		}

	}


