import java.util.Scanner;

public class Main {
	public static int n;
	public static int[] arr;
	public static Integer[] dp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+1];
		dp = new Integer[n+1];
		for(int i=1; i<n+1; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = arr[0];
		dp[1] =arr[1];
		if(n>1) {
			dp[2] =arr[1]+arr[2];
		}
			System.out.print(dp(n));
			
	}
public static int dp(int a) {
	if(dp[a] == null) {
		dp[a] = Math.max(Math.max(dp(a-2),dp(a-3)+arr[a-1])+arr[a],dp(a-1));
	
	}
	return dp[a];
	
}
}
