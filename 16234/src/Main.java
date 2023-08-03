import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


	 class pair{
		int x;
		int y;
	public	pair(int x, int y){
			this.x =x;
			this.y=y;
		}
	}
public class Main {
	static int n;
	static int[][]map;
	static boolean[][] visit;
	static int m,l;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<pair> q;
	static List<pair> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m =sc.nextInt();
		l= sc.nextInt();
		map = new int[n][n];
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int data = 0;
		while(true) {
			visit = new boolean[n][n];
			if(!move()) break;
			 data++;	
			
			
		}
		System.out.print(data);
	}
public static boolean move() {
	boolean flag = false;
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(visit[i][j]) continue;
			
			if(bfs(i,j)&&!flag) {
				flag =true;
			}
		}
		}
	return flag;
}
public static boolean bfs(int x, int y) {
	visit[x][y] = true;
	int sum =map[x][y];
	q = new LinkedList<pair>();
  list= new LinkedList<pair>();
  q.offer(new pair(x,y));
  list.add(new pair(x,y));
  while(!q.isEmpty()) {
	pair a = q.poll();
	for(int i=0; i<4; i++) {
		int nx = a.x+dx[i];
		int ny = a.y+dy[i];
		if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
			if(visit[nx][ny]) continue;
			int dic = Math.abs(map[a.x][a.y] - map[nx][ny]);
			if( l >= dic && m<=dic ) {
				visit[nx][ny]=true;
				sum+=map[nx][ny];
				q.add(new pair(nx,ny));
				list.add(new pair(nx,ny));
			}
			}		
		}
	}
  
	if(list.size()==1) {
		return false;
	}
	else {
		for(int i=0; i<list.size(); i++) {
			int b = sum / list.size();
			map[list.get(i).x][list.get(i).y] =b;
		}

		return true;
	}

  }

}
