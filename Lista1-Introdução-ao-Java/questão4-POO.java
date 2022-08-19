
/*Construa um algoritmo que fa ̧ca a leitura de dois n ́umeros inteiros e imprima no console qual numero
 ́e o maior, se o primeiro ou o segundo. */



import java.util.Scanner;

public class PAR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número :");
		int a = sc.nextInt();
		System.out.println("Digite o segundo número :");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a + " é maior que " + b);
		} else if (a == b) {
			System.out.println(a + " é igual a " + b);
		} else {
			System.out.println(b + " é maior que " + a);
		}
		sc.close();

	}
}
