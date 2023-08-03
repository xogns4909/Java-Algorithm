import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		int[] a =new int[T];
		for(int i=0; i<T; i++) {
			a[i] =sc.nextInt();
		}
	Arrays.sort(a);
	System.out.print(a[0]*a[a.length-1]);
	}

}
