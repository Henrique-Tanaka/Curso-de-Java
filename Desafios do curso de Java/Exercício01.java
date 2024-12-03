import java.util.Locale;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da largura, comprimento e metro quadrado:");
		double largura = sc.nextDouble(), comprimento = sc.nextDouble(), metroQuadrado = sc.nextDouble();
		double Area = largura * comprimento, Preço = Area * metroQuadrado;
		System.out.printf("Area = %.2f%n", Area);
		System.out.printf("Preço = %.2f", Preço);
		
		sc.close();
	}
}
