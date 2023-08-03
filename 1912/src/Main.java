import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int [] arr = new int[n];
		int [] dp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i =1; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(n == 1) {
			System.out.println(arr[1]);
		}
		dp[0] = arr[0];
		int max = dp[0];
		
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
