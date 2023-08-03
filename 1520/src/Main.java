import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//class pair{
//	int x;
//	int y;
//	int count;
//	pair(int x, int y, int count){
//		this.x=x;
//		this.y=y;
//		this.count=count;
//	}
//}
public class Main {
	static int n,m;
	static int map[][];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int cnt=0;
	static int visit[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m =sc.nextInt();
		map = new int[n][m];
		visit = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] =sc.nextInt();
				visit[i][j] = -1;
			}
		}
		System.out.println(bfs(0,0));
	}	

public static int bfs(int x, int y) {
	visit[x][y] =0;
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx < n && nx>=0 && ny < m && ny>=0) {
				if(map[x][y]>map[nx][ny]) {
					if(nx==n-1 && ny == m-1) {
						visit[x][y]+=1;
					}
				
					if(visit[nx][ny]>=0) {
					visit[x][y] += visit[nx][ny];
					}
					else 
						visit[x][y] += bfs(nx,ny);
				}
		
	}
	
}
		return visit[x][y];
}
}
