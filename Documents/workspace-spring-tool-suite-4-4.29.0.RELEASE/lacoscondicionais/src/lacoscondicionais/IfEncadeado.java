package lacoscondicionais;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {

		Scanner lerScannner = new Scanner (System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite sua  1 nota: ");
		nota1 = lerScannner.nextFloat();
		    		
		    
		System.out.println("Digite sua  2 nota: ");
		nota2 = lerScannner.nextFloat();
		    
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Aprovado ! " +  media);
		}else if (media >= 5) {
			System.out.println("Recuperação ! " + media);
		}else {
			System.out.println("Reprovado ! " + media);
		}
		
		lerScannner.close();
	}

}
