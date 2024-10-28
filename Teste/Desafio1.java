import java.util.Locale;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble(), A = x * y, P = A * z;
		System.out.printf("Area = %.2f%n", A);
		System.out.printf("Preço = %.2f", P);
		
		sc.close();
	}
}
