
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

//import java.until.Arrays;
public class algoritmos2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int a = sc.nextInt();
		System.out.println("Digite um número");
		int b = sc.nextInt();
		System.out.println("Digite um número");
		int c = sc.nextInt();
		System.out.println("Digite um número");
		int d = sc.nextInt();
		System.out.println("Digite um número");
		int e = sc.nextInt();
		System.out.println("Digite um número");
		int f = sc.nextInt();
		System.out.println("Digite um número");
		int g = sc.nextInt();
		System.out.println("Digite um número");
		int h = sc.nextInt();
		System.out.println("Digite um número");
		int i = sc.nextInt();
		System.out.println("Digite um número");
		int j = sc.nextInt();
		
		int[] array= {a,b,c,d,e,f,g,h,i,j};
		int[] reverso= new int[10];
		int posicaoreverso=0;
		for (i=array.length - 1; i>=0; i--) {
			reverso[posicaoreverso]=array[i];
			posicaoreverso++;
			
		}
		
		sc.close();
	}
}
