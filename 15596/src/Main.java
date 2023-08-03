import java.util.Scanner;

public class Main {
	public static int num;
	public static int[] arr;
	public static int[] sol;
	public static int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		arr = new int[num];
		sol = new int[4];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<4; j++) {
			sol[j] = sc.nextInt();
		}
		dfs(arr[0],1);
		System.out.println(max);
		System.out.print(min);
		
	}
	public static void dfs(int a,int deep) {
		if(deep == num) {
			max = Math.max(a, max);
			min= Math.min(a, min);
			return;
		}
		for(int i=0; i<4; i++) {
			if(sol[i]>0) {
				sol[i]--;
				if(i==0) {
					dfs(a+arr[deep],deep+1);
				}
				else if(i==1) {
					dfs(a-arr[deep],deep+1);
				}
				else if(i==2) {
					dfs(a*arr[deep],deep+1);
				}
				else if(i==3) {
					dfs(a/arr[deep],deep+1);
				}
				sol[i]++;
			}
		}
		
	}

}
