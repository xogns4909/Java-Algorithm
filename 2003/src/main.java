import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int s =sc.nextInt();
		int count =0;
		int[] arr =new int[n+1];
		int L=0,R=0;
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=arr[0];
		while(L<=R && R<n) {
			if(sum<s) {
				R+=1;
				sum+=arr[R];
			}
			else if(sum == s) {
				count+=1;
				R +=1;
				sum+=arr[R];
			}else if(sum > s) {
				sum -= arr[L];
				L+=1;
				if(L>R && L < n) {
					R =L;
					sum =arr[L];
					}
			}
			
		}
		System.out.print(count);
	}

}
