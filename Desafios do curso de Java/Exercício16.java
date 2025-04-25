//Faça um programa para ler em Celcius e mostrar o equivalente em Ferenheit.
//Perguntar ao usuário se deseja repetir (s/n).
//Caso o usuário digite "s", repetir o programa.

import java.util.Scanner;
import java.util.Locale;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble(), F = 9 * C / 5 + 32;
			System.out.printf("Equivalente Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repitir (s/n)? ");
			resp = sc.next().charAt(0);
	  } while (resp != 'n');
		
		sc.close();
	}
}
