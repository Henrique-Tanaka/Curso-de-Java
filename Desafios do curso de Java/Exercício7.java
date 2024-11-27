//Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decescente.
//A leitura deve ser encerrada caso os valores serem iguais.
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();
		
		while (x != y) {
			if(x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
			x = sc.nextInt(); 
			y = sc.nextInt();
		}
		System.out.println("Finalizado");
		
		sc.close();
	}
}
