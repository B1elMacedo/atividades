package exercicio1;
	
import java.util.Scanner;

public class teste01 {
	
	public static void main(String[] args) {
		
		int pontos = 10;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bem Vindo Otario!");
		System.out.println("___________________");
		System.out.println("Voce Sera Chamado de otario ate que me prove que nao é");
		System.out.println("Seus Pontos: "+pontos);
		System.out.println("digite uma letra para continuar:");
		String continuar = s.next();
		
		System.out.println("_________________________________________________");
		
		System.out.println("Você É viado? em em em?");
		System.out.println("Digite 1 pra sim ou 2 pra não ");
		int teste1 = s.nextInt();
		
		if (teste1 == 2) 
		{
			System.out.println("Tabom,Você passou no primeiro deste!, mas ainda é otario!");
			pontos = pontos + 1;
		}
		else if (teste1 == 1)
		{
			System.out.println("vixxxx, otario é gay pae slk....");
			pontos = pontos-1;
		}
		else 
		{
			System.out.println("Vocé é tao burro que não sabe nem digitar s ou n!");
			pontos = pontos-3;
		}
		
		System.out.println("_________________________________________________");
		
		System.out.println("escolha um time: ");
		System.out.println("Corinthians = 1 ");
		System.out.println("São Paulo = 2 ");
		System.out.println("PALmeiras = 3 ");
		int teste2 = s.nextInt();
		
		if (teste2 == 1) 
		{
				System.out.println("Brabo, mas ainda é otario!");
				pontos = pontos+1;
		} else if (teste2 == 2) 
		{
				System.out.println("GAYKKKKKKKKKKKKKKKK otario");
				pontos = pontos-1;
		}
		else if (teste2 == 3) 
		{
				System.out.println("Mano que gay vei KKKKKKKK seu time tem Pal no nome, cade o mundial?");			
				pontos =pontos -3;
		}
		else 
		{
				System.out.println("Burro do caraio sabe nem escolher!");
				pontos = pontos-4;
		}
		
			System.out.println("Seus pontos ate agr: "+pontos);
	
		System.out.println("_________________________________________________");
		
		
		System.out.print("ULTIMA PERGUNTA!");
		System.out.println("voce é LOUD OU FUIRA?");
		System.out.println("Furia = 1");
		System.out.println("loud(merda) = 2");
		int teste3 = s.nextInt();
		
		if (teste3 == 1) 
		{
				System.out.println("VOCÊ NAO É MAIS OTARIO,PARABBENS!");
				pontos = pontos + 5;
				
		}else if (teste3 == 2) 
		{
				System.out.println("Você continua otario.");
				pontos = pontos - 5;
		}else
		{
				System.out.println("BURRO,BURRO,BURRO E PRA RESPONDER 1 OU 2!");
		}
		
		System.out.println("_________________________________________________");
		
		System.out.println("Voce prefere 2 reais ou uma mensagem misteriosa?");
		System.out.println("Responda com 1 pra 2 reais,e 2 para mensagem misteriosa ");
		int teste4 = s.nextInt();
		
		if (teste4 == 1) 
		{
				System.out.println("Vou te dar nada não kkkkkkkk, sou so um pregrama burro ");
		} else if (teste4 == 2) 
		{
				System.out.println("VAI TOMAR NO CU ");
		}
	
	}
		
}
