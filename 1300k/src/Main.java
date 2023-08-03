import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		
		long s = 1;
		long f = k;
		while(s<f) {
			long count =0;
			long mid = (s+f)/2;
			for(int i=1; i<=n; i++) {
				count += Math.min(mid/i, n);
				}
			if(count >= k) {
				f = mid;
			}
			else {
				s = mid+1;
			}
			
		}
		System.out.print(s);
	}

}
