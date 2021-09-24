package MarioExercicio4;

public class Execucao {

	public static void main(String[] args) {
		Mario mario = new Mario();

		mario.setNariz("grande");
		mario.setOlhos("azuis brilhantes");
		mario.setEstatura("baixo");
		mario.setFisico("pouco corpulento");
		mario.setCabelos("castanho curto com duas costeletas, franjas grandes e um topete");
		mario.setBigode("bigode grosso castanho-escuro");
		mario.setRoupas("veste uma camisa vermelha e um macacão azul com botões amarelos");
		mario.setSapatos("marrons");
		mario.setAcessorios("luvas brancas");
		mario.mostrarCaracteristicas();
		mario.mostrarPoderes();
		System.out.println("=========================================================================");
		Mario mario2 = new Mario("MarioBros2", 52, 1.53f);

		mario2.setNariz("grande");
		mario2.setOlhos("azuis brilhantes");
		mario2.setEstatura("baixo");
		mario2.setFisico("pouco corpulento");
		mario2.setCabelos("castanho curto com duas costeletas, franjas grandes e um topete");
		mario2.setBigode("bigode grosso castanho-escuro");
		mario2.setRoupas("veste uma camisa vermelha e um macacão azul com botões amarelos");
		mario2.setSapatos("marrons");
		mario2.setAcessorios("luvas brancas");
		mario2.setEstamina(103);
		mario2.mostrarCaracteristicas();
		mario2.mostrarPoderes();

	}

}
