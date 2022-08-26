//Escreva um algoritmo em Java que solicite 5 notas e realize o calculo da media aritmetica ao termino
//da execucao.

import java.util.Scanner;



public class Array {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
System.out.println("Insira a nota 1");
int a = sc.nextInt();
System.out.println("Insira a nota 2");
int b = sc.nextInt();
System.out.println("Insira a nota 3");
int c = sc.nextInt();
System.out.println("Insira a nota 4");
int d = sc.nextInt();
System.out.println("Insira a nota 5");
int e = sc.nextInt();

float media = (a+b+c+d+e)/5;

System.out.println(media);

}
}