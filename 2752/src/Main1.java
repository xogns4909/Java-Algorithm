import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array= new int[3];
		for(int i=	0; i < 3; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int j=0; j <3; j++)
			System.out.print(array[j]+" ");
		}
	}


