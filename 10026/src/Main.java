import java.util.Scanner;

public class Main {
	static int n;
	static char map[][];
	static boolean visit[][];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new char[n][n];
		visit = new boolean[n][n];
		for(int i =0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<n; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		int cnt =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(visit[i][j]==false) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		int cnt_=0;
		visit = new boolean[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]=='G') {
					map[i][j]='R';
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(visit[i][j]==false) {
					dfs(i,j);
					cnt_++;
				}
			}
		}
		System.out.print(cnt+" "+cnt_);
	}
public static void dfs(int x,int y) {
	visit[x][y] =true;
	for(int i=0; i<4; i++) {
	 	int nx = x+dx[i];
		int ny = y+dy[i];
		if(nx>=0 && ny >= 0 && nx < n && ny <n) {
			if(!visit[nx][ny] && map[nx][ny]==map[x][y]) {
				dfs(nx,ny);
			}
		}
	}
	
}
}
