//Um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
//O programa será encerrado quando o código informado for o número 4.
//Vai estar escrita a mensagem: "Muito obrigado" e a quantidade de clientes que abasteceram cada tipo de combustível.
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Alcool = 0, Gasolina = 0, Diesel = 0, tipo = sc.nextInt();
		
		while(tipo != 4) {
			if(tipo == 1) {
				Alcool += 1;
			}
			else if(tipo == 2) {
				Gasolina += 1;
			}
			else if(tipo == 3) {
				Diesel += 1;
			}
			tipo = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		
		sc.close();
	}
}
