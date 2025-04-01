package interfacepolimorfismo;

public class Sapinho implements ControleRemoto, Som {

	@Override
	public void mover() {
		System.out.println("O sapinho pulou. ");
	}

	@Override
	public void mover(int velocidade) {
		System.out.println("O sapinho pulou a " + velocidade + " metros de altura!");
	}

	public void emitirSom() {
		System.out.println("O sapinho faz : Ueb Ueb! ");
	}
}
