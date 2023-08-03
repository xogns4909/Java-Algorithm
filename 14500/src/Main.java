import java.util.Scanner;

public class Main {
	static int[][] arr;
	static boolean[][] check;
	static int n,m;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		n =sc.nextInt();
		m=sc.nextInt();
		arr = new int[n][m];
		check = new boolean[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] =sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				bur(i,j,0,0);
				if(j+2 < m) {
					int temp =arr[i][j]+arr[i][j+1]+arr[i][j+2];
					if(i+1 < n) {
						int temp2 =temp + arr[i+1][j+1];
						if(temp2 > result) result = temp2;
					}
					if(i-1>=0) {
						int temp2 =temp+arr[i-1][j+1];
							if(temp2 > result) result =temp2;
						}
					}
				if(i+2 < n) {
					int temp = arr[i][j]+arr[i+1][j]+arr[i+2][j];
					if(j+1<m) {
						int temp2 = temp +arr[i+1][j+1];
						if(temp2 > result) result = temp2;
						}
					if(j-1 >= 0) {
						int temp2 = temp+arr[i+1][j-1];
						if(result > temp2) 	result =temp2;
						
					}
				}
			}
		}
		System.out.println(result);
	}
public static void bur(int x,int y,int sum,int cnt) {
	if(cnt == 4) {
		if(result < sum)  
			result = sum;
			return;
		
	}
		if(x < 0 || x>= n || y<0 || y>=m) return;
		if(check[x][y]) return;
		check[x][y] =true;
		for(int i=0; i<4; i++) {
			bur(x+dx[i],y+dy[i],sum+arr[x][y],cnt+1);
		}
		check[x][y]=false;

}

}
