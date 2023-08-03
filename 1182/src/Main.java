import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m =sc.nextInt();
		arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
			
		}
	int cnt=bur(arr,0,0);
	if(m==0) {
		cnt-=1;
	}
	System.out.print(cnt);
	}
public static int bur(int[] arr,int index, int sum) {
	if(index == arr.length) {
		if(sum == m) {
			return 1;
		}
		else {
			return 0;
		}
	}
	return bur(arr,index+1,sum+arr[index])+bur(arr,index+1,sum);
	
}
}
