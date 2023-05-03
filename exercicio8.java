package exercicio1;

import java.util.Scanner;


public class exercicio8 {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Numero da coluna: ");
		n1 = s.nextDouble();
		
		System.out.println("Digite o segundo numero da coluna: ");
		n2 = s.nextDouble();
		
		System.out.println("Digite o primeiro numero da segunda coluna:");
		n3 = s.nextDouble();
		
		n4 = (n2*n3)/n1;
		
		System.out.println("N1: "+ n1 +" "+"N2: "+ n2);
		
		System.out.println("N3: "+ n3 + " "+"N4: "+ n4);
		
		
		}
	
}
