import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr =new int[1000001];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		for(int i=3; i<=num; i++) {
			arr[i]=(arr[i-1]+arr[i-2]%15746);
			
		}
		System.out.print(arr[num]);
	}

}
