import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int time;
	pair(int x,int y, int time){
		this.x =x;
		this.y=y;
		this.time=time;
	}
}
public class Main {
	static int n,m;
	static char[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int cnt = Integer.MAX_VALUE;
	static Queue<pair> q = new LinkedList<>();
	static Queue<pair> water = new LinkedList<>();
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		map = new char[n][m];
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<m; j++) {
				map[i][j] =s.charAt(j);
				if(map[i][j]=='S')
					q.add(new pair(i,j,0));
				else if(map[i][j]=='*')
					water.add(new pair(i,j,0));
			}	
		}
		bfs();
		if(cnt == Integer.MAX_VALUE) {
			System.out.print("KAKTUS");
		}
		else {
			System.out.print(cnt);
		}
}
public static void bfs() {
	while(!q.isEmpty()) {
		int w_len = water.size();
		for(int j=0; j<w_len; j++) {
		pair w = water.poll();
		for(int i =0; i<4; i++) {
			int nx = w.x+dx[i];
			int ny = w.y+dy[i];
			if(nx >= 0  && nx <n && ny >=0 && ny <m) {
				if(map[nx][ny]== '.') {
					map[nx][ny] = '*';
					water.offer(new pair(nx,ny,0));
				}
			}
		}
		}
	int q_len = q.size();
	for(int j=0; j<q_len; j++ ) {
	pair a = q.poll();
	for(int i =0; i<4; i++) {
		int nx = a.x+dx[i];
		int ny = a.y+dy[i];
		if(nx >= 0  && nx <n && ny >=0 && ny <m && map[nx][ny]!='X') {
			if(map[nx][ny] == 'D'){
				cnt = Math.min(cnt, a.time+1);
				return;
			}
			if(map[nx][ny]=='.') {
				map[nx][ny]='S';
			q.add(new pair(nx,ny,a.time+1));
			
			}
		}
			
	}
	}
	}
	}
}