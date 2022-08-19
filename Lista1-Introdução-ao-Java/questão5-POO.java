/* Elabore um algoritmo em Java para saber se um inteiro é par ou impar*/




import java.util.Scanner;

public class PARIMPAR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número");
		int numero= sc.nextInt();
		if(numero%2==0) {
			System.out.println(numero+" é par");
		}else {System.out.println(numero+" é impar");}
		sc.close();

	}
}
