import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int time;
	public pair(int x, int y, int time){
		this.x=x;
		this.y=y;
		this.time =time;
		
	}
}
public class Main {
	static char map[][];
	static int n,m;
	static boolean visit[][];
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<pair> q;
	static int ma = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		sc.nextLine();
		map= new char[n][m];
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j);
				}
		}
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(map[i][j]=='L') {
					ma = Math.max(bfs(i,j,0),ma);
				}
				}
			}
			System.out.print(ma);
				}
		
public static int bfs(int x,int y,int time) {
	 q = new LinkedList<pair>();
	 visit = new boolean[n][m];
	 q.offer(new pair(x,y,0));
	 visit[x][y] = true;
	 int cnt =0;
	 while(!q.isEmpty()) {
		 pair a = q.poll();
		 for(int i=0; i<4; i++) {
			 int nx = a.x+dx[i];
			 int ny = a.y+ dy[i];
		if(nx >= 0 && ny >=0 && nx < n && ny < m && visit[nx][ny]==false) {
			if(map[nx][ny]=='L') {
				q.offer(new pair(nx,ny,a.time+1));
				visit[nx][ny]=true;
				cnt = Math.max(cnt, a.time + 1);
			}
			}
		 }
	}
	 return cnt;	
}
}
