import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class pair{
		int rx;
		int ry;
		int bx;
		int by;
		int count;
	public pair(int rx,int ry,int bx,int by, int count){
			this.rx= rx;
			this.ry =ry;
			this.bx =bx;
			this.by=by;
			this.count =count;
		}
	}
public class Main {
	static int  n,m;
	static char[][] map;
	static boolean[][][][] visit;
	static Queue<pair> q;
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rx=0;
		int ry=0;
		int bx=0;
		int by=0;
		int n =sc.nextInt();
		int m =sc.nextInt();
		map = new char[n][m];
		visit = new boolean[n][m][n][m];
		boolean su=false;
		q = new LinkedList<pair>();
		for(int i=0; i<n; i++) {
			String a =sc.next();
			for(int j=0; j<m; j++) {
				map[i][j] = a.charAt(j);
				if(map[i][j]=='R') {
					rx = i;
					ry=j;
				}
				else if(map[i][j]=='B') {
					bx =i;
					by =j;
				}
				}
		}
		q.offer(new pair(rx,ry,bx,by,0));
		visit[rx][ry][bx][by] =true;
		pair x=new pair(0,0,0,0,0);
		while(!q.isEmpty()) {
			x =q.poll();
//			System.out.println(x.rx+" "+x.ry+" "+x.bx+" "+x.by+" "+x.count);
			if(map[x.bx][x.by]=='O' ) continue;
			
			if(map[x.rx][x.ry]=='O') {
//				System.out.print(x.count);
				su = true;
				break;
			}
			else if(x.count > 10) {
			//	System.out.print(-1);
				break;
			}
			
			for(int i=0; i<4; i++) {
				int rnx = x.rx;
				int rny = x.ry;
				while(true) {
					rnx += dx[i];
					rny += dy[i];
					if(map[rnx][rny] =='#' || map[rnx][rny]=='O') break;
					}
//				System.out.println(rnx+" "+rny);
				if(map[rnx][rny] == '#') {
					rnx -=dx[i];
					rny -=dy[i];
				}
				int bnx =x.bx;
				int bny =x.by;
				while(true) {
					bnx +=dx[i];
					bny +=dy[i];
					if(map[bnx][bny] =='#' || map[bnx][bny]=='O') break;
				}
				if(map[bnx][bny]=='#') {
					bnx -=dx[i];
					bny -=dy[i];
				}
			if(rnx == bnx && rny == bny && map[rnx][rny] != 'O') {
			int r_d=Math.abs(x.rx - rnx)+Math.abs(x.ry - rny);
			int b_d=Math.abs(x.bx - bnx)+Math.abs(x.by -bny);
			if(r_d > b_d) {
				rnx -=dx[i];
				rny -=dy[i];
			}
			else {
				bnx -=dx[i];
				bny -=dy[i];
			}
			}
			if(visit[rnx][rny][bnx][bny]==false) {
				visit[rnx][rny][bnx][bny]=true;
				q.offer(new pair(rnx,rny,bnx,bny,x.count+1));
			}
			
			}
			
		}
		if(su==true) {
			System.out.println(x.count);
		}
		else
			System.out.print(-1);
	}		

	}
