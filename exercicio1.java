package exercicio1;


import java.util.Scanner; 
 
public class exercicio01 {

	
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);

		double numero1, numero2 ; 
		
		System.out.println("Escreva Um Numero:");
		numero1= s.nextDouble ();
		
		System.out.println("Escreva outro Numero:");
		numero2 = s.nextDouble ();
		
		System.out.println("o Numero: " + numero1 + " vezes o numero: " + numero2 + ":");
		
		System.out.println (numero1*numero2);
		
		
	}
}

		
