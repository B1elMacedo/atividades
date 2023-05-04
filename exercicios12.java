package exercicio1;

import java.util.Scanner;
import java.math.*;

public class exercicios12 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a area do circulo:");
		double d = s.nextDouble();
		
		double resultado = Math.sqrt((d/3.14));
		
		System.out.println("O raio do circulo é: " + resultado);
			
	}

}
