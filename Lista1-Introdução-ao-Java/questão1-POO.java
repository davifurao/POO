


/*Faca um algoritmo em Java para ler, usando o teclado, um n ́umero do tipo inteiro, um do tipo long

e outro do tipo float. Realize a leitura dos n ́umeros obdecendo a ordem descrita e exiba-os no con-
sole utilizando o printf (System.out.printf()) na mesma ordem. Formato da sa ́ıda (”O n ́umero inteiro

digitado foi NUMERO  ́ INTEIRO, o n ́umero long digitado foi NUMERO  ́ LONG e o n ́umero float foi
NUMERO  ́ FLOAT.”) */


import java.util.Scanner;

public class Exercicio {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o Inteiro");
		int a = sc.nextInt();
		System.out.println("Digite o Long");
		long b = sc.nextLong();
		System.out.println("Digite o Float");
		float c = sc.nextFloat();
		System.out.println("inteiro:"+a+"Long"+b+"float"+c);
		sc.close();/*fechamento do sc */
	}
}
