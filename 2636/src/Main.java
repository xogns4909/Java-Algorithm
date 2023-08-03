import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int time;
	pair(int x,int y, int time){
		this.x = x;
		this.y =y;
		this.time =time;
	}
}
public class Main {
	static char[][] map;
	static int n ,m;
	static boolean visit[];
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<pair> q = new LinkedList<pair>();
	static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m= sc.nextInt();
		map = new char[n][m];
		visit = new boolean[26];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String s =sc.nextLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		bfs(0,0,0);
		System.out.print(cnt);
	}
public static void bfs(int x,int y,int time) 
{
	if(visit[(int)(map[x][y]-'A')]==true) {
		cnt = Math.max(cnt,time);
		return;
	}
	else {
		visit[map[x][y]-'A'] = true;
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<m) {
				bfs(nx,ny,time+1);
				
			}
		}
		visit[map[x][y]-'A'] = false;
	}
}
}
