import java.util.Scanner;

public class Main {
	static int n;
	static boolean[] check =new boolean[20*100000+1];
	static int[] arr;
	
	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
			
		}
	bur(arr,0,0);
	int i=0;
	while(true) {
		i++;
		if(check[i]==false) {
			System.out.print(i);
			break;
		}
			
	}

	}
public static void bur(int[] arr,int index, int sum) {
	if(index == n) {
			check[sum] =true;
			return;
	}
	
	bur(arr,index+1,sum+arr[index]);
	bur(arr,index+1,sum);
	
}
}
