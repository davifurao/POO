
import java.lang.Math;
import java.util.Arrays;
//import java.until.Arrays;
public class algoritmos2 {
	public static void main(String[] args) {
		
		int[] array = new int[100];
	    float media = 0;
	    float mediaaritmetica = 0;
		for(int i= 0; i<100;i++) {
			
			array[i]= 1+ (int)(Math.random()*((100-1)+1));
			
		}
		System.out.println( Arrays.toString(array));
		
		
		
		for(int i=0;i<array.length;i++) {
			media=media+array[i];
			
		} mediaaritmetica=media/array.length; 
		System.out.println();//para quebrar a linha
		System.out.println(" media aritmética: "+ mediaaritmetica);
	}
}


