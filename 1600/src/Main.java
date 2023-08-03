import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int cnt;
	int k;
	pair(int x ,int y, int cnt,int k){
		this.x =x;
		this.y=y;
		this.cnt=cnt;
		this.k =k;
	}
}
public class Main {
	static int[][] map;
	static int k,n,m;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[] hdx= {-2,-2,-1,-1,1,1,2,2};
	static int[] hdy = {-1,1,-2,2,-2,2,-1,1};
	static Queue<pair> q; 
	static int result = Integer.MAX_VALUE;
	static boolean visit[][][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		k=sc.nextInt();
		n =sc.nextInt();
		m=sc.nextInt();
		map =new int[m][n];
		q = new LinkedList<pair>();
		visit = new boolean[m][n][k+1];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		q.offer(new pair(0,0,0,k));
		result = bfs();
		if(result == Integer.MAX_VALUE) {
			System.out.print(-1);
		}
		else {
			System.out.print(result);
		}
	}
public static int bfs() {
	visit[0][0][k]=true;
	while(!q.isEmpty()) {
		pair a = q.poll();
		if(a.x == m-1 && a.y==n-1) {
			return a.cnt; 
		}
	for(int i=0; i<4; i++) {
		int nx = a.x+dx[i];
		int ny = a.y+dy[i];
		if(nx >=0 && nx < m && ny >=0 && ny < n && !visit[nx][ny][a.k]) {
			if(map[nx][ny]!=1) {
				visit[nx][ny][a.k]=true;
				q.offer(new pair(nx,ny,a.cnt+1,a.k));
			}
			}
		}
	if(a.k > 0) {
	for(int i=0; i<8; i++) {
		int nx = a.x+hdx[i];
		int ny = a.y+hdy[i];
		if(nx >= 0 && nx < m && ny >= 0 && ny< n && !visit[nx][ny][a.k-1]) {
			if(map[nx][ny]!=1) {
				visit[nx][ny][a.k-1]=true;
				q.offer(new pair(nx,ny,a.cnt+1,a.k-1));
			}
			}
		}
		}
	}
	return result;
}
}
