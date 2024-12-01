//Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
//Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		
		while(senha != 2005) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}
