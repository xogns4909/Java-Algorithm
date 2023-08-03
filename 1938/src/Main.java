import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
	int x;
	int y;
	int dic;
	int cnt;
	pair(int x,int y,int dic,int cnt){
		this.x=x;
		this.y=y;
		this.dic=dic;
		this.cnt=cnt;
	}
}

public class Main {
	static int n;
	static char map[][];
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	static ArrayList<pair> start = new ArrayList<>();
	static ArrayList<pair> end = new ArrayList<>();
	static boolean visit[][][];
	static Queue<pair> q = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	n =sc.nextInt();
	map = new char[n][n];
	sc.nextLine();
	for(int i=0; i<n; i++) {
		String s = sc.nextLine();
		for(int j=0; j<n; j++) {
			map[i][j]=s.charAt(j);
			if(map[i][j]=='B') {
				start.add(new pair(i,j,0,0));
		}
			if(map[i][j]=='E') {
				end.add(new pair(i,j,0,0));
			}
		}
	}
	System.out.print(bfs());
}
static public int bfs() {
	visit = new boolean [2][n][n];
	int dir = 0;
	if(start.get(0).y+1 == start.get(1).y) dir = 0;
	else dir =1;
	q.add(new pair(start.get(1).x,start.get(1).y,dir,0));
	visit[dir][start.get(1).x][start.get(1).y]=true;
	while(!q.isEmpty()) {
		pair p = q.poll();
		if(p.x==end.get(1).x && p.y==end.get(1).y) {
			if(p.dic== 0 && map[p.x][p.y-1]=='E' && map[p.x][p.y+1]=='E') {
				return p.cnt;
			}
			else if(p.dic==1 && map[p.x-1][p.y]=='E' && map[p.x+1][p.y]=='E' ) {
				return p.cnt;
			}
		}
		
		for(int i=0; i<4; i++) {
			int nx = p.x+dx[i];
			int ny = p.y+dy[i];
			
			 if(p.dic == 0) {
				 if(!checkH(nx,ny,i))continue;
				}
			 else {
				 if(!checkV(nx,ny,i))continue;
			 }
			 
			 if(visit[p.dic][nx][ny]) continue;
			 visit[p.dic][nx][ny]=true;
			 q.add(new pair(nx,ny,p.dic,p.cnt+1));
		}	 
			 if(can(p.x,p.y)) {
				 if(p.dic ==0 && !visit[1][p.x][p.y]) {
					 visit[1][p.x][p.y]=true;
					 q.add(new pair(p.x,p.y,1,p.cnt+1));
				 }
				 else  if(p.dic ==1 && !visit[0][p.x][p.y]) {
					 visit[0][p.x][p.y]=true;
					 q.add(new pair(p.x,p.y,0,p.cnt+1));
				 }
			 }
	}
	return 0;
}
public static boolean checkV(int x,int y, int d) {
	if(d<2 ) {
		if(x-1<0 ||x+1>=n) return false;
		if(map[x][y]=='1'||map[x-1][y]=='1'||map[x+1][y]=='1')return false;
	}
	else {
		if(y<0||y>=n)return false;
if(map[x][y]=='1'||map[x-1][y]=='1'||map[x+1][y]=='1')return false;
	}
	return true;
}
public static boolean checkH(int x, int y, int d) {
	  if (d < 2) {
		  if(x<0||x>=n)return false;
		  if(map[x][y]=='1'||map[x][y-1]=='1'||map[x][y+1]=='1')return false;
	
		  }
	  else {
		  if(y-1<0 || y + 1>=n)return false;
		  if(map[x][y]=='1'||map[x][y-1]=='1'||map[x][y+1]=='1')return false;
		
	  }
	  return true;
}
public static boolean can(int x, int y) {
	for(int i=x-1; i<=x+1; i++) {
		for(int j=y-1; j<=y+1; j++) {
			if(i <0 || j < 0 || i >= n || j>= n) return false;
			if(map[i][j]=='1')return false;
		}
	}
	return true;
}
}
