import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] arr = new float[n];
		float total=0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			total +=(arr[i]/arr[arr.length-1])*100;
			
		}
		System.out.printf("%f",(total/n) );
	}

}
