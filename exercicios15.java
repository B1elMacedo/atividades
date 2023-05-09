package exercicio1;

import java.util.Scanner;

public class exercicios15 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double dol, rea, eur, ine, mex, aus;
		
		System.out.println("Quanto você tem em dorales: ");
		dol = s.nextDouble();
		
		rea = dol*5;
		eur = dol*0.91;
		ine = dol*134.54;
		mex = dol*17.87;
		aus = dol*1.50;
		
		System.out.println("você tem:");
		System.out.println("R$"+rea+" Reais");
		System.out.println("$"+eur+" euros");
		System.out.println("$"+ine+" ienes");
		System.out.println("$"+mex+" pesos mexicanos");
		System.out.println("$"+aus+" dolares australianos");
		
	}
	
}
