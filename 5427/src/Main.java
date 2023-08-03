import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y; 
	int cnt;
	pair(int x, int y, int cnt){
		this.x=x;
		this.y=y;
		this.cnt=cnt;
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
	static int t,n,m;
	static char[][] map;
	static boolean[][] visit;
	static Queue<pair> q;
	static Queue<fire> fire;
	static int[] dx = {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		sc.nextLine();
	for(int l=0; l<t; l++) {
		n=sc.nextInt();
		m=sc.nextInt();
		sc.nextLine();
		map=new char[m][n];
		visit= new boolean[m][n];
			q = new LinkedList<pair>();
			fire = new LinkedList<fire>();
			result = Integer.MAX_VALUE;
			for(int i=0; i<m; i++) {
			String s =sc.nextLine();
			for(int j=0; j<n; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='@') {
					q.offer(new pair(i,j,0));
				}
				if(map[i][j]=='*') {
					fire.offer(new fire(i,j));
				}
			}
		}
//		for(int i=0; i<m; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
	bfs();	
	if(result == Integer.MAX_VALUE) {
		System.out.println("IMPOSSIBLE");
	}
	else {
		System.out.println(result);
	}
	}

	}
public static void bfs() {
	while(!q.isEmpty()) {
		int size =fire.size();
		for(int i=0; i<size; i++) {
			fire f = fire.poll();
			for(int j=0; j<4; j++) {
				int nx = dx[j]+f.x;
				int ny = dy[j]+f.y;
				if(nx >= 0 && nx < m && ny >= 0 && ny<n) {
					if(map[nx][ny] == '.' || map[nx][ny] == '@') {
						map[nx][ny] = '*';
						fire.add(new fire(nx,ny));
					}

				}
				}
		}
		size = q.size();
		for(int i=0; i<size; i++) {
			pair p = q.poll();
			for(int j=0; j<4; j++) {
				int nx = dx[j]+p.x;
				int ny = dy[j]+p.y;
				if((nx < 0 || nx >=m || ny <0 || ny >= n)) {
					result = p.cnt+1;
					return;
				}
				if(nx >=0 && nx < m && ny>=0 && ny<n && map[nx][ny]=='.') {
				map[nx][ny]='@';
//				System.out.println(nx+""+ny);
				q.add(new pair(nx,ny,p.cnt+1));
			}
			}
		}
	}
	
}
}
