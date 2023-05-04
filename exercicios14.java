package exercicio1;

import java.util.Scanner;

public class exercicios14 {

	public static void main (String[] args) {
		
		double cel,fah,kev,rea,ran;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Dgite a temperatura em celsius");
		cel = s.nextDouble();
		
		fah = ((cel*9/5)+32);
		kev = (cel+273.15);
		rea = (cel* 4/5);
		ran = (cel*9/5+491.67);
		
		System.out.println("A temperatura Em celsius: º"+cel+":");
		System.out.println("em fahrenheit: º"+fah);
		System.out.println("em kelvin: º"+kev);
		System.out.println("em reaumur: º"+rea);
		System.out.println("em rankine: º"+ran);
		
		
	}
}