package ExerciciosMozao.Desafio5;

public class Floricultura {

	private String nome;
	private String endereco;
	private int numeroTel;

	public Floricultura(String nome, String endereco, int numeroTel) {

		this.setNome(nome);
		this.setEndereco(endereco);
		this.setNumeroTel(numeroTel);

	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

}
