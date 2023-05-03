package exercicio1;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class exercicio9 {

	public static void main(String[ ] args){
		
	Scanner s = new Scanner(System.in);
	
	String nome, data;
	double n1, n2, media;
	
	System.out.println("Digite Seu Nome: ");
	nome = s.next();
	
	System.out.println("Digite sua data: ");
	data = s.next();
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	try {
		Date date = formatter.parse(data);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	System.out.println("Digite Uma Nota:");
	n1 = s.nextDouble();
	
	System.out.println("Digite Outra Nota:");
	n2 = s.nextDouble();
	
	media = (n1+n2)/2 ;
	
	
	System.out.println("_____________________");
	
	System.out.println("Seu Nome: "+ nome);
	System.out.println("Sua data: "+ data);
	System.out.println("E sua media:"+ media);
	}
}
