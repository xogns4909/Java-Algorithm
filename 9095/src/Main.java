import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		for(int i =3; i<10; i++) {
			arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0; i<t; i++) {
			int n = sc.nextInt();
			System.out.println(arr[n-1]);
		}
	}

}
