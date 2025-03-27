package exer1;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 int salario, abono, novoSal;
		 
		   System.out.println("Digite o valor do seu Salário ");
	        salario = ler.nextInt();
	 
	        System.out.println("Informe o valor do abono: ");
	        abono = ler.nextInt();
	        novoSal = salario + abono;
	        
	        System.out.println("O novo salário é: " + novoSal);
	        
	}

}
