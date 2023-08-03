import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int cnt;
	pair(int x, int y, int cnt){
		this.x = x;
		this.y=y;
		this.cnt =cnt;
	}
}
class fire{
	int x;
	int y;
	fire(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class Main {
	static int n,m;
	static char[][] map;
	static int result = Integer.MAX_VALUE;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static Queue<pair> q = new LinkedList<pair>();
	static Queue<fire> fire= new LinkedList<fire>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m = sc.nextInt();
		map= new char[n][m];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='J') {
					q.offer(new pair(i,j,0));
				}
				else if(map[i][j]=='F') {
					fire.offer(new fire(i,j));
				}
			}
		}
			bfs();
			if(result == Integer.MAX_VALUE) {
				System.out.println("IMPOSSIBLE");
			}
			else	System.out.println(result);
			
	}
public static void bfs() {
	while(!q.isEmpty()) {
		int size = fire.size();
		for(int i=0; i<size; i++) {
			fire f = fire.poll();
			for(int j=0; j<4; j++) {
				int nx = dx[j]+f.x;
				int ny = dy[j]+f.y;
				if(nx>=0 && nx <n && ny>=0 && ny<m && map[nx][ny]!='#' && map[nx][ny]!='F') {
					map[nx][ny]='F';
					fire.offer(new fire(nx,ny));
				}
			}
		}
		size = q.size();
		for(int i =0; i<size; i++) {
			pair p = q.poll();
			for(int j=0; j<4; j++) {
				int nx = dx[j]+p.x;
				int ny = dy[j]+p.y;
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
					result = Math.min(result, p.cnt+1);
					return;
				}
				
				else if(map[nx][ny]=='.') {
					map[nx][ny] ='J';
					q.offer(new pair(nx,ny,p.cnt+1));
				}
			}
		}
	}
	return;
}

}
