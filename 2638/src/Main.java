import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
	int x;
	int y;
	pair(int x,int y){
		this.x =x;
		this.y =y;
		
	}
}

public class Main {
	static int n;
	static int m;
	static int map[][];
	static boolean[][] visit;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static Queue<pair> q;
	static int cnt=0;
	static int time =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
			n=sc.nextInt();
			m=sc.nextInt();
			map = new int[n][m];
			q = new LinkedList<>();
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					map[i][j]=sc.nextInt();
					if(map[i][j]==1) {
						q.add(new pair(i,j));
						cnt+=1;
					}
				}
			}
			while(cnt != 0) {
					time++;
					visit= new boolean[n][m];
					find();
					ch();
			}
			System.out.print(time);
	}
public static void find() {
	Queue<pair> f = new LinkedList<>();
	f.add(new pair(0,0));
	visit[0][0]=true;
	map[0][0] =2;
	while(!f.isEmpty()) {
		pair p = f.poll();
		for(int i=0; i<4; i++) {
			int nx = p.x+dx[i];
			int ny = p.y+dy[i];
		if(nx>=0 && nx <n && ny >=0 && ny < m && !visit[nx][ny] && map[nx][ny]!=1) {
			visit[nx][ny]= true;
			map[nx][ny]=2;
			f.offer(new pair(nx,ny));
		}
		}
	}
}
public static void ch() {
	int b = q.size();
	for(int i=0; i<b; i++) {
		int a =0;
		pair p = q.poll();
		for(int j=0; j<4; j++) {
			int nx = p.x+dx[j];
			int ny = p.y+dy[j];
			if(nx >= 0 && nx < n &&  ny>=0 && ny < m && map[nx][ny]==2) {
				a+=1;
			}
		}
		if(a >= 2 ) {
			map[p.x][p.y]=0;
			cnt -=1;
		}
		else {
			q.add(new pair(p.x,p.y));
		}
	}
}

}
