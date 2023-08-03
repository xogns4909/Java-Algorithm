import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
	
class pair{
	int x;
	int count;
	pair(int x ,int count){
		this.x =x;
		this.count=count;
	}
}
public class Main {
	public static  int map[];
	static int cnt =0;
	static int dx[] = {1,-1,2,2};
	static int su,si;
	static int time =Integer.MAX_VALUE;
	static boolean[] visit = new boolean[100001];
	static Queue<pair> q = new LinkedList<pair>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		su = sc.nextInt();
		si = sc.nextInt();
		q.offer(new pair(su,0));	
		bfs();
		System.out.print(time);
	}
public static void bfs() {
	while(!q.isEmpty()) {
	pair n = q.poll();
	visit[n.x] = true;
	if(n.x==si) {
		time = Math.min(time, n.count);
	}
	if(n.x * 2 <= 100000 && visit[n.x * 2] == false) q.offer(new pair(n.x * 2, n.count));
    if(n.x + 1 <= 100000 && visit[n.x + 1] == false) q.offer(new pair(n.x + 1, n.count + 1));
    if(n.x - 1 >= 0 && visit[n.x - 1] == false) q.offer(new pair(n.x - 1, n.count + 1));
	}
	}

}
		
