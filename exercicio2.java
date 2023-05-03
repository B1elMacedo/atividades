package exercicio1;

import java.math.*;
import java.util.Scanner; 
 
public class exercicio2 {

	
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);

		double numero1; 
		
		System.out.println("Escreva Um Numero:");
		numero1= s.nextDouble ();
		
		System.out.println("o Numero: " + numero1 + " elevado ao quadrado: ");
		
		System.out.println (Math.pow(numero1, 2)) ;
		
		
	}
}