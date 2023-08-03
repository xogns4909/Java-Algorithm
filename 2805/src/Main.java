import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int[] n = new int[N];
		int min =0;
		int max =0;
		for(int i=0; i<N; i++) {
			n[i] =sc.nextInt();
		
			if(max<n[i]) {
				max =n[i];
				}
			
		}
		while(min<max) {
			int mid =(max+min)/2;
			long sum =0;
			for(int i=0; i<N; i++) {
				if(n[i]-mid>0) {
					sum+=n[i]-mid;
				}
				
			}
			if(sum<M) {
				max =mid;
				
			}
			else {
				min=mid+1;
			}
		}
		System.out.print(min-1);
	}

}
