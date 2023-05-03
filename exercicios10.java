package exercicio1;

import java.util.Scanner;

public class exercicios10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Qual É o seu nome: ");
		nome = s.next();
		
		System.out.println("Digite Sua Idade: ");
		idade = s.nextInt();
		
		if (idade<18) {
			
			System.out.println(nome + ", Você não pode comprar cachaça!!");
			
		}else {
			
			System.out.println(nome + ", Você Pode Comprar Cachaça!!!");
		}
		
	}
}
