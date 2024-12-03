//Este código lê idades até que uma idade negativa seja inserida. 
//Soma todas as idades válidas (não negativas) e calcula a média dessas idades.
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
