	import java.util.Scanner;

public class Main {
	public static int[][] arr;
	public static int n;
	public static int row;
	public static int col;
	public static int cnt;
 	public static int x,y;
 	public static int c=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			c =2;
			col =sc.nextInt();
			row = sc.nextInt();
			cnt =sc.nextInt();
			arr = new int[row][col];
			for(int j=0; j<cnt; j++) {
				 x =sc.nextInt();
				 y =sc.nextInt();
				arr[y][x] =1;
			}
		for(int k=0; k<row; k++) {
			for(int l=0; l<col; l++) {
				if(arr[k][l]==1) {
					dfs(k,l,c);
					c+=1;
				}
			}
		}
	System.out.println(c-2);
		}
	}
 	public static void dfs(int a,int b,int c) {
 		if(arr[a][b]!=c) {
 			arr[a][b] =c;
 		}
 		if(a!=0 && arr[a-1][b]==1) {
 			arr[a-1][b] = c;
 			dfs(a-1,b,c);
 		}
 		if(a!= row-1 && arr[a+1][b] ==1) {
 			arr[a+1][b] = c;
 			dfs(a+1,b,c);
 			
 		}
 		if(b>0 && arr[a][b-1]==1) {
 			arr[a][b-1] = c;
 			dfs(a,b-1,c);
 			}
 		if(b!=col-1 && arr[a][b+1]==1) {
 			arr[a][b+1] = c;
 			dfs(a,b+1,c);
 		}
 	}
}
