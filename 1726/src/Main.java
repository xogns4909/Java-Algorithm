import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int dic;
	int cnt;
	public pair(int x,int y,int dic,int cnt) {
		this.x=x;
		this.y=y;
		this.dic=dic;
		this.cnt=cnt;
	}
}
public class Main {
	static int m,n;
	static int map[][];
	static boolean visit[][][];
	static pair start;
	static pair fi;
	
	static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		map = new int[n+1][m+1];
		visit = new boolean[n+1][m+1][5];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		start = new pair(sc.nextInt(),sc.nextInt(),sc.nextInt(),0);
		fi = new pair(sc.nextInt(),sc.nextInt(),sc.nextInt(),0);
		bfs();
	}	
	 static void bfs() {
	        Queue<pair> q = new LinkedList<>();
	        visit[start.x][start.y][start.dic] = true;
	        q.add(start);

	        while (!q.isEmpty()) {
	            pair p = q.poll();

	            if (p.x == fi.x && p.y == fi.y && p.dic == fi.dic) {
	                System.out.println(p.cnt);
	                return;
	            }

	            for (int i = 1; i <= 3; i++) {
	                int nx = p.x + (dx[p.dic - 1] * i);
	                int ny = p.y + (dy[p.dic - 1] * i);

	               if (nx <= 0 || ny <= 0 || nx > n || ny > m) continue;

	                if (map[nx][ny] == 0) {
	                    if (!visit[nx][ny][p.dic]) {
	                        visit[nx][ny][p.dic] = true;
	                        q.add(new pair(nx, ny, p.dic, p.cnt + 1));
	                    }
	                } else {
	                    break;
	                }
	            }
	            
	            for (int i = 1; i <= 4; i++) {
	                if (p.dic != i && !visit[p.x][p.y][i]) {
	                    int turn = 1;
	                    if (p.dic == 1) {
	                        if (i == 2) {
	                            turn++;
	                        }
	                    } else if (p.dic == 2) {
	                        if (i == 1) {
	                            turn++;
	                        }
	                    } else if (p.dic == 3) {
	                        if (i == 4) {
	                            turn++;
	                        }
	                    } else {
	                        if (i == 3) {
	                            turn++;
	                        }
	                    }

	                    visit[p.x][p.y][i] = true;
	                    q.add(new pair(p.x, p.y, i, p.cnt + turn));
	                }
	            }
	        }
	    }
}
