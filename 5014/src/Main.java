import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int time;
	pair(int x,int time){
		this.x=x;
		this.time=time;
	}
}
public class Main {
	static int F,S,G,U,D;	
	static boolean visit[];
 	static int cnt =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		F = sc.nextInt();
		S=sc.nextInt();
		G=sc.nextInt();
		U=sc.nextInt();
		D=sc.nextInt();
		visit = new boolean[F+1];
		int cnt = bfs();
		if(cnt==-1) {
			System.out.print("use the stairs");
		}
		else {
			System.out.print(cnt);
		}
	}
public static int bfs() {
	Queue<pair>  q = new LinkedList<>();
	q.offer(new pair(S,0));
	while(!q.isEmpty()) {	
	pair n = q.poll();
		if(n.x == G) {
			return n.time;
		}
		if( n.x+U <= F && visit[n.x+U] == false) {
			q.offer(new pair(n.x+U,n.time+1));
			visit[n.x+U] =true;
		}
		if( n.x-D > 0 && visit[n.x-D] == false) {
			q.offer(new pair(n.x-D,n.time+1));
			visit[n.x-D] =true;
		}
		}	
return -1;	
	}
}
