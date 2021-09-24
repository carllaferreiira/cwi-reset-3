package Caneta;

public class Caneta {

	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	{

	}

	public Caneta(String m, String c, float p) { // Este é o método construtor
		this.modelo = m;
		this.cor = c;
		this.ponta = p; // this.setPonta(p); Dá PRA FAZER DESSA MANEIRA TAMBÉM!!!
		// this.cor = "Azul";

	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void destampada() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);

	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");

		}

	}
}
