
import java.lang.Math;
import java.util.Arrays;
//import java.until.Arrays;
public class algoritmos2 {
	public static void main(String[] args) {
		
		int[] array = new int[100];
	
		for(int i= 0; i<100;i++) {
			
			array[i]= 1+ (int)(Math.random()*((100-1)+1));
			
		}
		System.out.println( Arrays.toString(array));
		
		
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println("É par: "+array[i]);
			}
		}
	}
}


