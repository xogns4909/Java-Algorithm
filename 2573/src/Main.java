import java.util.Scanner;

public class Main {
	static int n,m,t;
	static int map[][];
	static boolean visit[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int cnt[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		t=0;
		map= new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		while (true){
		cnt = new int[n][m];
		visit = new boolean[n][m];
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]!=0 && visit[i][j]==false) {
					dfs(i,j);
					count++;
				}
			}
		}
		if(count >= 2) {
			System.out.print(t);
			break;
		}
		else if(count == 0){	
			System.out.print(0);
			break;
		}
		bfs();
		t++;
		}
	}
public static void dfs(int x,int y) {
	visit[x][y]= true;
	for(int i=0; i<4; i++) {
		int nx = x+dx[i];
		int ny = y+dy[i];
		if(nx >= 0 && nx <n && ny>= 0 && ny <m){
			if(map[nx][ny]==0) {
				cnt[x][y]+=1;
			}
			if(map[nx][ny]!=0 && visit[nx][ny]==false) {
				dfs(nx,ny);
			}
		}
	}
}
public static void bfs() {
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			map[i][j]-=cnt[i][j]; 
			if(map[i][j] < 0) {
				map[i][j]=0;
			}
		
		}
	}
}
}
