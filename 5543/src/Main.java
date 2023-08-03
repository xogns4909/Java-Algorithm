import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hmin = 0;
		int cmin = 0;
		Scanner sc = new Scanner(System.in);
		int[] arr =new int[5];
		for(int i=0; i<5; i++) 
			arr[i] =sc.nextInt();
		hmin = (int)Math.min(arr[1],(int)Math.min(arr[2], arr[0]));
		cmin = (int)Math.min(arr[3], arr[4]);
		System.out.print(hmin+cmin-50);
	}

}
