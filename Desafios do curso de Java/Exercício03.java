import java.util.Locale;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloca cada número de A, B e C para resolver a fórmula de Bhaskara:");
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		double delta = b*b - 4*a*c;
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossível calcular");
		}
		else {
			double x1 = (-b + Math.sqrt(delta))/(2*a), x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f",x2);
		}
		
		sc.close();
	}
}
