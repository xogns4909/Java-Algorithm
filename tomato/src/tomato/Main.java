package tomato;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int z;
	int y;
	int x;
	int count;
	pair(int z,int y,int x,int count){
		this.z =z;
		this.x =x;
		this.y =y;
		this.count=count;
	}
}

public class Main {
	static int h;
	static int n;
	static int m;
	static int[][][] arr;
	static boolean check[][][];
	static int[] dx = {0,0,1,-1,0,0};
	static int[] dy= {1,-1,0,0,0,0,};
	static int[] dz= {0,0,0,0,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		h=sc.nextInt();
		arr = new int[h][n][m];
		check = new boolean[h][n][m];
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m;k++) {
				arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.print(bfs());
	}
public static int bfs() {
	int result=0;
	Queue<pair> q = new LinkedList<pair>();
	for(int i=0; i<h; i++) {
		for(int j=0; j<n; j++) {
			for(int k=0; k<m; k++) {
			if(arr[i][j][k]==1) {
				q.offer(new pair(i,j,k,0));
			}
		}
	}
	}
	while(!q.isEmpty()) {
		pair p = q.remove();
		int z=p.z;
		int y = p.y;
		int x=p.x;
		int count =p.count;
		for(int i=0; i<6; i++) {
			if(z+dz[i]<h && z+dz[i]>=0&&x+dx[i] >= 0 && x+dx[i]<m && y+dy[i] >=0 && y+dy[i] <n  && arr[z+dz[i]][y+dy[i]][x+dx[i]]==0) {
				arr[z+dz[i]][y+dy[i]][x+dx[i]] = 1;
				q.offer(new pair(z+dz[i],y+dy[i],x+dx[i],count+1));
			}
		}
		result = count;
	}
	for(int i=0; i<h; i++) {
		for(int j=0; j<n; j++) {
			for(int k=0; k<m; k++) {
			if(arr[i][j][k]==0) {
				return -1;
			}
//		System.out.println();
		}
		}
	}
	return result;
}
}