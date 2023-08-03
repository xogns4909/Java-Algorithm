import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
	public static int arr[][];
	public static boolean visit[][];
	public static int n;
	public static int m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visit = new boolean[n][m];
		for(int i=0; i<n; i++) {
			 String s = br.readLine();
			for(int j=0; j<m; j++) {
				arr[i][j] = s.charAt(j) - '0';
	}
		}
		
		visit[0][0]=true;
		bfs(0,0);
		System.out.println(arr[n-1][m-1]);
		
	}
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			if(nowX ==n-1 && nowY ==m-1) {
				break;
			}
			for(int i=0; i<4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
		                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                		    continue;
        		        if (visit[nextX][nextY] || arr[nextX][nextY] == 0)
                    		continue;
                    
		                q.add(new int[] {nextX, nextY});
        		        arr[nextX][nextY] = arr[nowX][nowY] + 1;
                		visit[nextX][nextY] = true;
			}
		}
	}
}

