package collections2;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		
		
		
		System.out.println("\nElementos da pilha: " + pilha);
		

		System.out.println("\nRetirar prato da Pilha: " + pilha.pop());
		
		System.out.println("\nElementos da pilha: " + pilha);
		
		System.out.println("\nRetirar prato da Pilha: " + pilha.pop());
		
		
		System.out.println("\nElementos da pilha: " + pilha);
	}

}
