package interfacepolimorfismo;

public class MenuControleRemoto {

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();
		Sapinho sapinho = new Sapinho();

		carrinho.mover();
		carrinho.mover(5);
		carrinho.emitirSom();
		
		sapinho.mover();
		sapinho.emitirSom();
		sapinho.mover(2);
	}

}
