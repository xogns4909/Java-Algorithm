import java.util.Scanner;

public class Main {
	public static int[] array;
	public static boolean[] num;
	public static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		array = new int[m];
		num = new boolean[n];
		dfs(1,n,m,0);
		System.out.print(sb);
	}
		public static void dfs(int a,int n,int m, int s) {
			if(s==m) {
				
				for(int i=0; i<m; i++) {
					sb.append(array[i] + " ");
					
				}	
				sb.append('\n');
				return;
				}
			for(int i=a; i<=n; i++) {
//				if(num[i]==false) {
//					num[i] =true;
					array[s] =i;
					dfs(i,n,m,s+1);
//					num[i] =false;
				}
			}
		
		
		
	}


