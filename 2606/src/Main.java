import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
 public static int n;
 public static int line;
 public static boolean[] check;
 public static int[][] checked; 
public static int cnt=1;	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		line= sc.nextInt();
		check = new boolean[n+1];
		checked = new int[n+1][n+1];
		for(int i=0; i<line; i++) {
			int x =sc.nextInt();
			int y=sc.nextInt();
			
			checked[x][y] = 1;
			checked[y][x] =1;
		}
			bfs();
		System.out.print(cnt-1);
	}
public static int bfs() {
	 Queue<Integer> queue = new LinkedList<Integer>();
	 queue.offer(1);
	 check[1] = true;
	  while(!queue.isEmpty()) {
		  int temp = queue.poll();
		  
		  for(int j = 1; j <= n; j++) {
		        if(checked[temp][j] == 1 && check[j] == false) {
		          queue.offer(j);
		          check[j] = true;
		          cnt+=1;
	  }
	  }
}
	  return cnt;
}
}
