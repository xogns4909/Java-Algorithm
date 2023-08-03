import java.util.Scanner;

public class Main {
	static int n,total;
	static int arr[];
	static int dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 n =sc.nextInt();
		 total =sc.nextInt();
		 arr = new int[n+1];
		 dp = new int[total+1];
		 dp[0] =1;
		 for(int i=1; i<=n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 for(int i=1; i<=n; i++) {
			 												System.out.print("i : "+i);
			 for(int j = arr[i]; j<=total; j++) {
				 											System.out.print(", j,arr[i] : "+j);
				 dp[j] += dp[j-arr[i]];
															System.out.println(", dp[j] : "+dp[j]);
			 }
		 }	
		 System.out.print(dp[total]);
	}

}
