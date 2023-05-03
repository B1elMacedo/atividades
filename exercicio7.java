package exercicio1;

 import java.math.*;
 import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] angs) {
		
	double raiz, resultado;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Escreva Um numero: ");
	raiz = s.nextDouble();
	
	resultado = Math.sqrt(raiz);
	
	System.out.println("A raiz Quadrada De "+raiz+" é: "+ resultado);
	
		
	}
	
}
