import java.util.Scanner;

public class Main {
	public static int n;
	public static int[] arr;
	public static Integer[] dp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		dp = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
			for(int j=0; j<n; j++) {
				dp[j] = 1;
				for(int k=0; k<j; k++) {
					if(arr[j]>arr[k] && dp[j]<=dp[k]) {
						dp[j]=dp[k]+1;
					}
				}
			}
			
		int max = dp[0];
		for(int i=1; i<n; i++) {
				if(max<dp[i]) {
					max=dp[i];
				}
		}
		System.out.print(max);
}	
	}


