import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
	int x;
	int y;
	int count;
	 pair(int x,int y,int count){
		 this.x =x;
		 this.y=y;
		 this.count = count;
		}
}

public class Main {
	static int[][] arr;
	static int n;
	static int[] dx= {-2,-2,2,2,-1,-1,1,1};
	static int[] dy= {1,-1,1,-1,-2,2,-2,2};
	static int x_1,y_1,x_2, y_2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int i=0; i<t; i++) {
			n =sc.nextInt();
			arr = new int[n][n];
			x_1 =sc.nextInt();
			y_1 =sc.nextInt();
			x_2 =sc.nextInt();
			y_2 =sc.nextInt();
			arr[x_1][y_1]=1; 
			System.out.println(bfs());
		}
	}
public static int bfs() { 
	Queue<pair> q = new LinkedList<pair>();
	q.offer(new pair(x_1,y_1,0));
	while(!q.isEmpty()) {
		pair p = q.remove();
		int x =p.x;
		int y =p.y;
		int count =p.count;
		if(x == x_2 && y== y_2) {
			return count;
		}
		for(int i=0; i<8; i++) {
			if(x+dx[i]>=0 && x+dx[i]<n && y+dy[i] >=0 && y+dy[i]<n) {
				if(arr[x+dx[i]][y+dy[i]]==0) {
					arr[x+dx[i]][y+dy[i]]=1;
					q.offer(new pair(x+dx[i],y+dy[i],count+1));
				}
			}
		}
		
	}
	return 0;
 	
	}
}
