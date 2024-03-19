package exercicio_operadores_aritmeicos;

import java.util.Scanner;
		
public class exercicio_operadores_aritmeicos {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//primeiro valor
		System.out.println("Insira um número inteiro:");
		int n1 = scan.nextInt();
				
		System.out.println("\nO dobro do número escolhido é " + (n1*2));
		
	        scan.close();

    }
}
