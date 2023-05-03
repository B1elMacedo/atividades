package exercicio1;

import java.util.Scanner; 

public class exercicios11 {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	double n1;
	
	System.out.println("Digite Um Numero: ");
	n1 = s.nextDouble();
	
	for (int i = 1; i <= 1000; i++) {
		if (((n1 % i) ==0)) {
            System.out.println("O número " + n1 + " é Divisivel por: "+ i);
			}
		}
	}
}
	

//if ((n1%2) == 0) {
//System.out.println("divisível por 2");
//}else if ((n1%3) == 0){
//System.out.println("divisível por 3");
//}else if ((n1%4)== 0) {
//System.out.println("divisível por 4");

//}else if ((n1%5)== 0) {
//System.out.println("divisível por 5");

//}else if ((n1%6)== 0) {
//System.out.println("divisível por 6");

//}else if ((n1%7)== 0) {
//System.out.println("divisível por 7");

//}else if ((n1%8)== 0) {
//.out.println("divisível por 8");

//}else if ((n1%9)== 0) {
//System.out.println("divisível por 9");

//}else {
//System.out.println("Não tem Divisor");
//}