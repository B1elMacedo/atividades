package exercicio1;

import java.util.Scanner;

public class exercicios17 {
	
	public static void main(String[] args) {
		
		int tab;
		int n1 = 1;
		
	Scanner s = new Scanner(System.in);
	
	for (int l = 1; l <= 10; l++) {
		
		n1 = l;
		tab = l;
		
			for (int i = 1; i <= 10; i++) {
			
					n1 = tab*i;
					System.out.println(tab+" X "+i+" ="+n1);
		}
		
		System.out.println("_______________");
		
		}

	}
}
