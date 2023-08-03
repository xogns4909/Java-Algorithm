import java.util.Scanner;

public class Main {
	public static int[][] arr;
	public static Integer[][] re;
	public static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		arr = new int[n][n];
		re = new Integer[n][n];
		for(int i =0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			re[n-1][i]=arr[n-1][i];
		}
		System.out.print(dp(0,0));
	}
public static int dp(int a,int deep) {
	if(n-1 == deep) {
		return re[a][deep];
		}
	if(re[a][deep] == null) {
		re[a][deep]=Math.max(dp(a+1,deep), dp(a+1,deep+1))+arr[a][deep];
	}
		return re[a][deep];

}
}
