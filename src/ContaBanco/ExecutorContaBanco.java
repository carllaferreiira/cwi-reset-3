package ContaBanco;


public class ExecutorContaBanco {

	public static void main(String[] args) {
	
		ContaBanco contaBanco = new ContaBanco();

		contaBanco.setNumConta(2);
		contaBanco.setTipo("CP");
		contaBanco.setDono("César");
		contaBanco.setSaldo(10.530f);
		contaBanco.setStatus(true);
		
		
		contaBanco.contaBanco();
	}

}
