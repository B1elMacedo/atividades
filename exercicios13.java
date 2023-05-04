package exercicio1;

import java.util.Scanner;

public class exercicios13 {

	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite Um numero: ");
		int n1 = s.nextInt();
		
		System.out.println("Digite Outro Numero: ");
		int n2 = s.nextInt();
		
		if (n1 > n2) {
			System.out.println("O numero "+n1+" É maior que o Numero "+n2);
		} else if (n2>n1) {
			System.out.println("O numero "+n2+" É maior que o numero "+n1);
		}else {
			System.out.print("Os numeros São Iguais");
		}
	}
}
