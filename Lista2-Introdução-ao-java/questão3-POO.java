
import java.lang.Math;
import java.util.Arrays;

//import java.until.Arrays;
public class algoritmos2 {
	public static void main(String[] args) {

		int[] array = new int[100];
		int[] arrayreverso = new int[100];
		int posicaoarray=0;
		for (int i = 0; i < 100; i++) {

			array[i] = 1 + (int) (Math.random() * ((100 - 1) + 1));

		}
		System.out.println(Arrays.toString(array));

		for (int i = array.length - 1; i >= 0; i--) {
			arrayreverso[posicaoarray]=array[i];
			posicaoarray++;
		}

		System.out.println(Arrays.toString(arrayreverso));
	}
}
