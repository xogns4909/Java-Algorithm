import java.util.Scanner;

public class Main {
	public static int n;
	public static int[]	arr;
	public static int[] dp1;
	public static int[] dp2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		arr = new int[n];
		dp1 = new int[n];
		dp2 = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
		for(int i=0; i<n; i++) {
			dp1[i]=1; 
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && dp1[i] <= dp1[j]) {
					dp1[i] = dp1[j]+1;
					
				}
		}
		}
		for(int i=n-1; i>=0; i--) {
			dp2[i]=1;
			for(int j=n-1; j>=i; j--) {
				if(arr[i] >arr[j] &&dp2[i]<= dp2[j]) {
					dp2[i] = dp2[j]+1;
				}
			}
			
		}
		int max =0;
		for(int i=0; i<n; i++) {
			//System.out.println(dp1[i]+" "+dp2[i]);
			if(max<dp1[i]+dp2[i]) {
				max = dp1[i]+dp2[i];
			}
		}
			System.out.print(max-1);
		
	}

}
