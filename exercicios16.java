package exercicio1;

import java.util.Scanner;

public class exercicios16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite Uma temperatura em celsius: ");
		double tem = s.nextDouble();
		
		if (tem < 18) 
		{
				System.out.println("Nossa, esta frio!");
		}
		else if (tem > 24)
		{
				System.out.println("Nossa, esta quente!");
		}
		else
		{
				System.out.println("O clima esta Agradavel!");
		}
		
	}
}
