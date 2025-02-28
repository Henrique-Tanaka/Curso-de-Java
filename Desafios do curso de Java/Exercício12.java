//O arquivo da entrada contém dois valores inteiros(X e Y).
//O programa deve imprimir um valor inteiro. 
//Este valor é a soma dos valores impares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(), Y = sc.nextInt(), min, max;
		if(X < Y) {
			min = X; max = Y;
		}
		else {
			min = Y; max = X;
		}
		
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		
		sc.close();
	}
}
