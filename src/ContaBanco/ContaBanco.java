package ContaBanco;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("");
	}

	public ContaBanco() {

		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setDono(dono);
		this.setSaldo(saldo);
		this.setStatus(status);

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;

	}

	public void mostrarStatus() {

	}

	public void contaBanco() {

		System.out.println("Conta Bancaria:");
		System.out.println("NumConta: " + this.numConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dono: " + this.dono);
		System.out.println("Status: ");
		this.Status();

	}

	public void Status() {
		if (this.status == false) {
			System.out.println("Erro! Conta enexistente");
		} else {
			System.out.println("Conta ativa");
		}

	}

	public void abrirConta() {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);

		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada porque tem débito");
		} else {

			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float valor) {
		if (this.getStatus()) {

			// this.saldo = this.saldo + valor;

			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());

		} else {
			System.out.println("Imposivel depositar em uma conta fechada!");

		}

	}

	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
			System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Imposivel sacar de uma conta fechada!"); 
			}
		
			
		}

	public void pagarMensal() {
		int valor = 0;
		if (this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
			
		}
		if (this.getStatus()) {
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada");
		}

	}

}
