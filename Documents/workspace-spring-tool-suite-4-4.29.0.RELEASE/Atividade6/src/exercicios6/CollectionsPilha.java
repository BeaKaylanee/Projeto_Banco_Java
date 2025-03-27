package exercicios6;

import java.util.Scanner;
import java.util.Stack;

public class CollectionsPilha {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);

		Stack<String> pilhaDeLivros = new Stack<String>();
		int opcao;

		do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar um novo livro na pilha");
            System.out.println("2 - Listar todos os livros da pilha");
            System.out.println("3 - Retirar um livro da pilha");
            System.out.println("0 - Finalizar programa");
            System.out.print("Digite uma opção: ");

            opcao = lerScanner.nextInt();
            lerScanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("\nDigite o nome do livro: ");
                String livro = lerScanner.nextLine();
                pilhaDeLivros.push(livro);
                
                System.out.println("\nPilha:");
                for (String l : pilhaDeLivros) {
                    System.out.println(l);
                }
                System.out.println("\nLivro adicionado!");

            } else if (opcao == 2) {
                if (pilhaDeLivros.isEmpty()) {
                    System.out.println("\nA pilha está vazia!");
                } else {
                    System.out.println("\nLista de Livros na Pilha:");
                    for (String l : pilhaDeLivros) {
                        System.out.println(l);
                    }
                }

            } else if (opcao == 3) {
                if (pilhaDeLivros.isEmpty()) {
                    System.out.println("\nA pilha está vazia!");
                } else {
                    pilhaDeLivros.pop();
                    
                    System.out.println("\nPilha:");
                    for (String l : pilhaDeLivros) {
                        System.out.println(l);
                    }
                    System.out.println("\nUm livro foi retirado da pilha!");
                }

            } else if (opcao == 0) {
                System.out.println("\nPrograma Finalizado!");

            } else {
                System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        lerScanner.close();
	}

}
