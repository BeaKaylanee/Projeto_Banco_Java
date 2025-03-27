package objeto;

public class Menu {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();

		gato1.setNome("Lolinha ");
		gato2.setNome("Lulu ");
		
		gato2.miar();
		gato2.visualizar();
		
	}

}
