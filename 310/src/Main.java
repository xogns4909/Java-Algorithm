import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
public class Main {
static class pair{
	int x;
	int y; 
	pair(int x ,int y) {
		this.x =x;
		this.y =y;
	}
}

	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int n;
	static int board[][];
	static HashMap<Integer, String> map;
	static Queue<pair> snake= new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		n = sc.nextInt();
		map = new HashMap<>();
		board = new int[n][n];
		int l = sc.nextInt();
		for( int i=0; i<l; i++) {
				int a =sc.nextInt();
				int b =sc.nextInt();
				board[a-1][b-1] = 1; 
			}
		int k= sc.nextInt();
		for(int i=0; i<k; i++) {
			int a= sc.nextInt();
			String b = sc.next();
			map.put(a,b);
		}
		int time =0;
		int turn =0;
		board[0][0] =2;
		pair head = new pair(0,0);
		snake.add(head);
	while(true) {
	time++;
	int nx = head.x +dx[turn];
	int ny = head.y +dy[turn];
	System.out.println(nx+" "+ny+" "+turn);
	if(nx<0 || ny<0 || nx>n-1|| ny> n-1) break;
	 if(board[nx][ny]==2) break;
//	 if(snake.contains(new pair(nx,ny))) break;
	if(board[nx][ny]!=1) {
		pair tail = snake.poll();
		board[tail.x][tail.y] =0;
	}
	 head = new pair(nx,ny);
	 snake.add(head);
	board[nx][ny] = 2; 
	 
	 if(map.containsKey(time)) {
		 if(map.get(time).equals("D")) {
			 turn +=1;
			 if(turn == 4) turn =0;
		 }
		 else {
			 turn -=1;
			 if(turn == -1) turn =3;
		 }

	 }
	}
	System.out.println(time);
	
	}
}

