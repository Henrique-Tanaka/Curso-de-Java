//Leia o valor inteiro N(2<N<1000). A seguir, mostre a tabuada de N:
// 1 x N = 1N; 2 x N = 2N; ... 10 x N = 10N
//A entrada contém um valor inteiro N(2<N<1000).
//A saida imprima a tabuada de N.
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
	}
}
