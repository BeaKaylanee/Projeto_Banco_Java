package exe1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 float Nota1, Nota2, Nota3, Nota4, media;
		 
		    System.out.println("Digite sua  1 nota: ");
		    Nota1 = ler.nextFloat();
		    
		    System.out.println("Digite sua  2 nota: ");
		    Nota2 = ler.nextFloat();
		    
		    System.out.println("Digite sua  3 nota: ");
		    Nota3 = ler.nextFloat();
		    
		    System.out.println("Digite sua  4 nota: ");
		    Nota4 = ler.nextFloat();
	       
	        media = (Nota1 + Nota2 + Nota3 + Nota4 )/ 4 ;
	        
	        System.out.printf("Sua média é = %.1f\n", media);
	        
	        ler.close();

	}

}
