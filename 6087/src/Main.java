import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
	int x;
	int y;
	int dir;
	int mir;
	pair(int x, int y, int dir,int mir){
		this.x = x;
		this.y = y;
		this.dir=dir;
		this.mir=mir;
	}
}

public class Main {
	static int n,m;
	static char[][] map;
	static pair start;
	static pair finish;
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,-1,1};
	static int visit[][];
	static int result =Integer.MAX_VALUE;
	static Queue<pair> q = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sc.nextLine();
		map = new char[m][n];
		visit = new int[m][n];
		for(int i=0; i<m; i++) {
			String s = sc.nextLine();
			for(int j=0; j<n; j++) {
				map[i][j]=s.charAt(j);
				if(map[i][j]=='C') {
					if(start == null) {
					start=(new pair(i,j,-1,0));
					}
					else {
						finish = (new pair(i,j,-1,0));
					}
				}
			}
		}
			bfs();
			System.out.println(result);
		
		
	}
public static void bfs() {
	q.add(start);
	visit[start.x][start.y]=1;
	while(!q.isEmpty()) {
		pair p = q.poll();
		if(p.x==finish.x && p.y == finish.y) {
			result = Math.min(result,p.mir);
		continue;
		}
		for(int i=0; i<4; i++) {
			int nx = p.x+dx[i];
			int ny = p.y+dy[i];
			int nd = i;
			if(nx < 0 || nx >= m || ny < 0 || ny >= n || map[nx][ny] == '*')
				continue;
			
			int nm = p.mir;
					if(p.dir != -1 && p.dir != nd) { 
						nm += 1; 
					}
					if(visit[nx][ny]==0) {
						visit[nx][ny]=nm;
						q.add(new pair(nx,ny,nd,nm));
					}
					else if(visit[nx][ny] >= nm) {
						visit[nx][ny]=nm;
						q.add(new pair(nx,ny,nd,nm));
				}
			
		}
	}
}
}

