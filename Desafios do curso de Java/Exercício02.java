import java.util.Locale;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite duas notas:");
		double A = sc.nextDouble(), B = sc.nextDouble(), C = (A+B)/2;
		
		System.out.printf("Primeira nota: %.1f%n", A);
		System.out.printf("Segunda nota: %.1f%n", B);
		System.out.printf("Resultado: %.1f%n", C);
		
		if (C > 6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}
