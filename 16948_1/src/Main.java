import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int count;
	public pair(int x,int y,int count){
	this.x=x;
	this.y=y;
	this.count=count;
	}
}
public class Main {
	public static int[] dx = {-2,-2,0,0,2,2};
	public static int[] dy = {-1,1,-2,2,-1,1};
	public static int[][] map;
	public static int count =0;
	public static boolean[][] check;
	public static int r1,c1,r2,c2,n;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r1=sc.nextInt();
		c1=sc.nextInt();
		r2=sc.nextInt();
		c2=sc.nextInt();
		map = new int[n][n];
		check =new boolean[n][n];
		System.out.print(Bfs());
	}


public static int Bfs() {
	Queue<pair> q = new LinkedList<pair>();
	q.offer(new pair(r1,c1,0));
	while(!q.isEmpty()) {
		pair p= q.remove();
		int x=p.x;
		int y=p.y;
		int count =p.count;
	if(x== r2 && y ==c2) {
		return count;
	}
	check[y][x]=true;
	for(int i=0; i<6; i++) {
		if(y+dy[i] >= 0 && x+dx[i] >=0 && y+dy[i] < n && x+dx[i]<n) {
			if(check[y+dy[i]][x+dx[i]]==false) {
				q.offer(new pair(x+dx[i],y+dy[i],count+1));
			}
		}
	}
	}
	return -1;
}
}
