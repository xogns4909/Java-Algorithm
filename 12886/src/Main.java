import java.util.Scanner;

public class Main {
	static int a;
	static int b;
	static int c;
	static int sum;
	static boolean check[][] =new boolean[1501][1501];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
		sum = a+b+c;
		if(sum %3 !=0) {
			System.out.print(0);
			System.exit(0);
			}
		dfs(a,b);
		if(check[sum/3][sum/3]) {
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}
		}
public static void dfs(int x,int y) {
	if(check[x][y]) {
		return;
	}
	check[x][y]=true;
	int[] arr = {x,y,sum-x-y};
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			if(arr[i]<arr[j]) {
				int[] arr_2= {x,y,sum-x-y};
				arr_2[i] +=arr[i];
				arr_2[j] -=arr[i];
				dfs(arr_2[i],arr_2[j]);
			}
		}
	}
}

}
