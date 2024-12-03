import java.util.Scanner;
import java.util.Locale;
public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Produto1: R$39.99, produto2: R$59.99, produto3: R$49.99, produto4: R$79.99, produto5: R$99.99");
		System.out.println("Primeiro digite um dos produtos entre 1 ao 5 e depois digite a quantidade do item que escolheu: ");
		
		double codigo = sc.nextDouble(), quantidade = sc.nextDouble(), total;
		if(codigo == 1) {
			total = quantidade * 39.99;
		}
		else if(codigo == 2) {
			total = quantidade * 44.99;
		}
		else if(codigo == 3) {
			total = quantidade * 49.99;
		}
		else if(codigo == 4) {
			total = quantidade * 19.99;
		}
		else if(codigo == 5) {
			total = quantidade * 99.99;
		}
		else {
			System.out.println("Não temos esse produto");
			sc.close();
			return;
		}
		
		System.out.printf("Total: R$%.2f%n",total);
		
		sc.close();
	}
}
