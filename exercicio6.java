package exercicio1;

import java.math.*;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
	double cat1, cat2, hip, resutado; 
	
	Scanner s = new Scanner(System.in); 
	
	System.out.println("Escreva o primeiro Cateto: ");
	cat1 = s.nextDouble();
	
	System.out.println("Escreva Outro Cateto: ");
	cat2 = s.nextDouble();
	
	resutado = (cat1*cat1)+(cat2*cat2);
	
	resutado = Math.sqrt(resutado);
	
	System.out.println("a hipotenusa é: :"+ resutado);
	
	
		}
}
