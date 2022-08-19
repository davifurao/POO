
/* Escreva um algoritmo em Java para realizar o c ́alculo de  ́area de um trap ́ezio retˆangulo. Todas as
entradas do usu ́ario devem estar em cm. A sa ́ıda do algoritmo deve ser a  ́area do trap ́ezio em cm2 no
console (e.g. ”A  ́area do trap ́ezio em cm2  ́e ”). A f ́ormula  ́e*/


import java.util.Scanner;

public class TRAPEZIO {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira o valor da base MAIOR em CM");
	double bmaior = sc.nextDouble();
	System.out.println("Insira o valor da base MENOR em CM");
	double bmenor = sc.nextDouble();
	System.out.println("Insira o valor da ALTURA em CM");
	double altura = sc.nextDouble();
	double area = ((bmaior+bmenor)* altura)/2;
	System.out.println("A área do trapézio é :"+area);
	sc.close();
	}
}
