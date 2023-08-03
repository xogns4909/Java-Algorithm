import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x; 
	int y;
	pair(int x, int y){
		this.x= x;
		this.y= y;
	}
}
public class Main {
	static int r,c,s,a,b;
	static Queue<pair> o= new LinkedList<>();
	static int[][] map;
	static boolean[][] visit;
	static int cnt=0;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		map=new int[r][r];
		visit= new boolean[r][r];
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				map[i][j]=sc.nextInt();
				}
		}
		for(int k=1; k<c+1; k++) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				if(map[i][j]==k) {
					o.offer(new pair(i,j));
				}
				}
			}
		}
			s = sc.nextInt();
			a = sc.nextInt();
			b=sc.nextInt();
			bfs();
		sc.close();
//		for(int i=0; i<r; i++) {
//			for(int j=0; j<c; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
			System.out.print(map[a-1][b-1]);
		}
		
	
public static void bfs() {
	while(cnt != s) {
		int size = o.size();
		for(int i=0; i<size; i++) {
			pair p = o.poll();
		for(int j=0; j<4; j++) {
			int nx = p.x+dx[j];
			int ny = p.y+dy[j];
			if(nx>=0 && nx < r && ny >= 0 && ny < r && !visit[nx][ny] && map[nx][ny]==0) {
//				System.out.println(map[p.x][p.y]);
				map[nx][ny]=map[p.x][p.y];
				visit[nx][ny]=true;
				o.offer(new pair(nx,ny));
			}
		}
		}
//		size = t.size();
//		for(int i=0; i<size; i++) {
//			pair p = t.poll();
//		for(int j=0; j<4; j++) {
//			int nx = p.x+dx[j];
//			int ny = p.y+dy[j];
//			if(nx>=0 && nx < r && ny >= 0 && ny < c && !visit[nx][ny] && map[nx][ny]==0) {
//				map[nx][ny]=2;
//				visit[nx][ny]=true;
//				t.offer(new pair(nx,ny));
//			}
//		}
//		}
//		size = th.size();
//		for(int i=0; i<size; i++) {
//			pair p = th.poll();
//		for(int j=0; j<4; j++) {
//			int nx = p.x+dx[j];
//			int ny = p.y+dy[j];
//			if(nx>=0 && nx < r && ny >= 0 && ny < c && !visit[nx][ny] && map[nx][ny]==0) {
//				map[nx][ny]=3;
//				visit[nx][ny]=true;
//				th.offer(new pair(nx,ny));
//			}
//		}
//		}
		cnt+=1;
	}
}

}
