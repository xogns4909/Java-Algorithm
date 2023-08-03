import java.util.Scanner;

public class Main {
	static int n;
	static int[][] map;
	static int cnt =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] =sc.nextInt();
				
				}
			}
	dfs(0,1,0);
	System.out.print(cnt);
	}
public static void dfs(int x,int y, int dic) {
	if(x==n-1 && y==n-1)
	{
		cnt +=1;
		return;
		}
	if(dic == 0) {
		if(y+1 < n && map[x][y+1]==0) {
			dfs(x,y+1,0);
		}
	}
	else if(dic == 1) {
		if(x+1 < n && map[x+1][y]==0) {
			dfs(x+1,y,1);
		}
	}
	else if(dic ==2) {
		if(y+1 < n && map[x][y+1]==0) {
			dfs(x,y+1,0);
		}
		if(x+1 < n && map[x+1][y]==0) {
			dfs(x+1,y,1);
		}
	}
	if(x+1 < n && y+1 <n && map[x+1][y]==0 && map[x][y+1]==0&& map[x+1][y+1]==0) {
		dfs(x+1,y+1,2);
	}
}
}
