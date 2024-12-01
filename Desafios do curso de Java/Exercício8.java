//Este código em Java lê numeros até que um numero negativo seja inserido. 
//Ele soma todas os numeros válidos (não negativos) e calcula a média desses numeros.
import java.util.Scanner;
import java.util.Locale;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int idade = sc.nextInt(), soma = 0, cont = 0;
		
		while(idade >= 0) {
			soma += idade;
			cont += 1;
			idade = sc.nextInt();
		}
		if(cont > 0) {
			double media = (double)soma / cont;
			System.out.printf("%.2f", media);
		}
		else {
			System.out.println("Impossível calcular");
		}
		
		sc.close();
	}
}
