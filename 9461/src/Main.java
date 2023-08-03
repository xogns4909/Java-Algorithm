import java.util.Scanner;

public class Main {
	public static long[] arr= new long[101];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)
		int tr = sc.nextInt();
		arr[0]=1L;
		arr[1]=1L;
		arr[2]=1L;
		for(int j=0; j<tr; j++) {
			int num =sc.nextInt();
		for(int i=3; i<num; i++) {
			arr[i] =arr[i-2]+arr[i-3];
		}
			System.out.println(arr[num-1]);
		
		}
	}

}
