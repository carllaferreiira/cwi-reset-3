package Caneta;

public class OriObjetosaula4 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
		c1.status();
		Caneta c2 = new Caneta("KKk", "Laranja", 1.5f);
		c2.status();
		
		//c1.setModelo("BIC");
		//*c1.modelo = "BIC"; //Acesso direto pq � p�blico!
		//c1.setPonta (05f);
		//c1.ponta = 0.5f; //N�o vai dar pq � uma atributo FLOAT privado! S� vai dar pra fazer assim se usar a palavra GET na frente!
		//c1.status();
		//*System.out.println("Tenho uma caneta " + c1.getModelo() + " de cor azul" + " de ponta " + c1.getPonta());
		

	}

	

}
