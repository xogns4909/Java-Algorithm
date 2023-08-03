import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int time;
	pair(int x, int y, int time){
		this.x=x;
		this.y=y;
		this.time=time;
	}
}

public class Main {
	static int n;
	static int m;
	static int map[][];
	static boolean[][] visit;
	static boolean combi[];
	static int dx[]= {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	static int result = Integer.MAX_VALUE;
	static ArrayList<pair> v = new ArrayList<>();
	static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		map= new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==0) {
					cnt+=1;
					}
				else if(map[i][j]==2) {
					v.add(new pair(i,j,0));
				}
			}
			
		}
		combi= new boolean[v.size()];
		com(0,0);
		if(result == Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(result);
		}
	
	}
public static void com(int start, int count) {
	if(count == m) {
		result=Math.min(result,bfs());
		return;
	}
	for(int i=start; i<v.size(); i++) {
		if(combi[i]==false) {
		combi[i]=true;
		com(i+1,count+1);
		combi[i]=false;
		}
	}
}
public static int bfs() {
	Queue<pair> q = new LinkedList<>();
	visit = new boolean[n][n];
	for(int i=0; i<v.size(); i++) {
		if(combi[i]==true) {
			q.add(new pair(v.get(i).x,v.get(i).y,0));
			visit[v.get(i).x][v.get(i).y]=true;
		}
	}
		int a=0;
		int b=0;
		while(!q.isEmpty()) {
			pair p = q.poll();
			for(int i=0; i<4; i++) {
				int nx = p.x+dx[i];
				int ny = p.y+dy[i];
			
				if(nx>=0 && nx <n && ny>=0 && ny <n) {
					if(!visit[nx][ny]&&map[nx][ny]!=1) {
						if(map[nx][ny]==0) {
							a+=1;
							b=p.time+1;
						}
						visit[nx][ny]=true;
						q.add(new pair(nx,ny,p.time+1));
						
					}
				}
			}
		}	
		if(cnt==a) {
			return b;
		}
		return Integer.MAX_VALUE;
}
}
