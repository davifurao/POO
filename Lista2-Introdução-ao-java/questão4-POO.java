
import java.lang.Math;
import java.util.Arrays;
//import java.until.Arrays;
public class algoritmos2 {
	public static void main(String[] args) {
		
		int[] array = new int[100];
		double divisores=0;
		int[] arrayprimo = new int[100];
		for(int i= 0; i<100;i++) {
			
			array[i]= 1+ (int)(Math.random()*((100-1)+1));//adicionar valores no array
			
		}
		System.out.println( Arrays.toString(array));//imprimir array
		
		
		
		for(int i=0;i<array.length;i++) {//percorrer o array
			for(int j=1;j<=array[i];j++){//começa por um pois não dá para dividir por zero
				if (array[i]%j==0){
					divisores++;
					
				}else {}
			}if(divisores<=2){
				arrayprimo[i]=array[i];
				System.out.println("primo do array: "+array[i]);//percorrer os divisores e imprimir na tela
			}else {} divisores=0;
		}
	}
}


