import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	
	public pair(int x, int y) {
		this.x =x;
		this.y=y;
	}
}

public class Main {
	static int n;
	static int[][]  map;
	static int[][] dp;
	static Queue<pair> q;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	
 	static int result =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j]= sc.nextInt();
				}
		}
		dp = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				result = Math.max(dfs(i,j),result);
//				System.out.print(bfs(i,j,0));
			}
		}
		System.out.print(result);
	}
	public static int dfs(int x, int y) {
        if(dp[x][y] != 0) return dp[x][y];
        
        dp[x][y] = 1;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if(map[nx][ny] > map[x][y]) {
                    dp[x][y] = Math.max(dp[x][y],  dfs(nx, ny) + 1);
                }
            }
        }
        return dp[x][y];
    }
}

