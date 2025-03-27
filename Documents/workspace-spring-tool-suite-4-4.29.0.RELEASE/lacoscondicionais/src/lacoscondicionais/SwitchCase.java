package lacoscondicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner lerScannner = new Scanner (System.in);
		
        int opcao;
        String nome;
        
        System.out.println("##############################################");
        System.out.println("Digite 1 para  indicar  um livro:            |");
        System.out.println("Digite 2 para ler uma frase:                 |");
        System.out.println("Digite 3 para  a indicação de uma lmúsica:   |");
        System.out.println("##############################################");
        opcao = lerScannner.nextInt();        
        switch (opcao) {
        
		case 1: 
			
			System.out.println("Digite o nome do seu livro favorito: ");
			lerScannner.nextLine();
			nome = lerScannner.nextLine().toUpperCase();
			
			if (nome.equalsIgnoreCase("O Alquimista") || nome.equalsIgnoreCase("senhor") ) {
				System.out.println("Esse livro é bom! ");
			}else {
				System.out.println("Não gostei ! ");
			}
			break;
		case 2:
			
			System.out.println("A jornada de mil milhas começa com um único passo ");
			break;
		case 3:
			
			System.out.println("Indicação de música: Luther, SZA and Kendrick  ");
			break;
			
			default:
				System.out.println("Opção inválida ! ");
		}
        
        lerScannner.close();
	}

}
