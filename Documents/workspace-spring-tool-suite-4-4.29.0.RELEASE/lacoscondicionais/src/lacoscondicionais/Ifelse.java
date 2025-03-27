package lacoscondicionais;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner lerScannner = new Scanner (System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite sua  1 nota: ");
		nota1 = lerScannner.nextFloat();
		    		
		    
		System.out.println("Digite sua  2 nota: ");
		nota2 = lerScannner.nextFloat();
		    
		media = (nota1 + nota2) / 2;
		
		 System.out.println((media >= 6) ? "Aprovado! Média: " + media : "Reprovado! Média: " + media);
		 
		lerScannner.close();
	}

}
