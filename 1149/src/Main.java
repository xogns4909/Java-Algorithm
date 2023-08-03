import java.util.Scanner;

public class Main {
	public static int n;
	public static int[][] arr;
	public static int[][] result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][3];
		result = new int[n][3];
		for(int i =0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] =sc.nextInt();
			}
		}
			result[0][0]=arr[0][0];
			result[0][1]=arr[0][1];
			result[0][2]=arr[0][2];
			System.out.println(Math.min(so(n-1,2),Math.min(so(n-1,0), so(n-1,1))));
	}
public static int so(int N,int color) {
	if(result[N][color] == 0) {
		if(color==0) {
			result[N][0] = Math.min(so(N-1,1),so(N-1,2))+arr[N][0];
	}
		if(color==1) {
			result[N][1] = Math.min(so(N-1,0),so(N-1,2))+arr[N][1];
	}
		if(color==2) {
			result[N][2] = Math.min(so(N-1,1),so(N-1,0))+arr[N][2];
		}
			

	}
	return result[N][color];
}
}