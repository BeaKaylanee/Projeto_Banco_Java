package lacosrepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner lerScannner = new Scanner (System.in);
		
		boolean continua;
		
		System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
        System.out.print("\nDeseja usar nossa calculadora de soma? (s/n): ");
        continua = lerScannner.next().equalsIgnoreCase("s"); //para conseguir verificar o maiusculo ou minusculo
        System.out.println("\n++++++++++++++++++++++++++++++++++++++");
        
        while (continua) {
			
        	System.out.println("Digite o primeiro valor: ");
        	int num1 = lerScannner.nextInt();
        	
        	System.out.println("Digite o segundo valor: ");
        	int num2 = lerScannner.nextInt();
        	
        	int resul1 = num1 + num2;
        	System.out.println("O resultado da soma de " + num1 + " + " +  num2 + " = " + resul1) ;
        	
        	System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
            System.out.print("\nDeseja usar nossa calculadora de soma? (s/n): ");
            continua = lerScannner.next().equalsIgnoreCase("s"); 
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");
		}
        
	}

}
