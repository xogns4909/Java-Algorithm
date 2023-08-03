import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int check[][];
	public static boolean checked[];
	public static int n;
	public static int line;
	public static int start;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 n =sc.nextInt();
		 line = sc.nextInt();
		 start =sc.nextInt();
		 check = new int[n+1][n+1];
		 checked = new boolean[n+1];
		 for(int i=0; i<line; i++) {
			 int x =sc.nextInt();
			 int y =sc.nextInt();
			 
			 check[x][y] =1;
			 check[y][x]=1;
		 }
		 dfs(start);
		 checked = new boolean[n+1];
		 System.out.println("");
		 bfs();
	}
	 public static void dfs(int i) {
		    checked[i] = true;
		    System.out.print(i + " ");
		    
		    for(int j = 1; j <= n; j++) {
		      if(check[i][j] == 1 && checked[j] == false) {
		        dfs(j);
		      }
		    }
		  }
		public static void bfs() {
		    Queue<Integer> queue = new LinkedList<Integer>();
		    queue.offer(start);
		    checked[start] = true;
		    System.out.print(start + " ");
		    
		    
		    while(!queue.isEmpty()) {
		      int temp = queue.poll();
		      
		      for(int j = 1; j <= n; j++) {
		        if(check[temp][j] == 1 && checked[j] == false) {
		          queue.offer(j);
		          checked[j] = true;
		          System.out.print(j + " ");
		        }
		      }
		    }
		  }
	}

