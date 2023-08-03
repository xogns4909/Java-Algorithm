import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int z;
	int x;
	int y;
	int cnt;
	pair(int z,int x, int y,int cnt){
		this.z= z;
		this.x=x;
		this.y=y;
		this.cnt = cnt;
	}
}
public class Main {
	static int l,r,c;
	static char map[][][];
	static boolean visit[][][];
	static int dz[] = {1,-1,0,0,0,0};
	static int dx[] = {0,0,1,-1,0,0};	
	static int dy[] = {0,0,0,0,-1,1};
	static Queue<pair> q;
	static pair end;
	static pair a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			l =sc.nextInt();
			r =sc.nextInt();
			c=sc.nextInt();
			sc.nextLine();
			if(l==0 && r==0 && c ==0) {
				break;
			}
			map = new char[l][r][c];
			visit = new boolean[l][r][c];
			for(int i=0; i<l; i++) {
				for(int j=0; j<r; j++) {
					String s = sc.nextLine();
					for(int k=0; k<c; k++) {
					map[i][j][k]=s.charAt(k);	
					if(map[i][j][k]=='S')
					{
						  a = new pair(i, j, k, 0);
						visit[i][j][k] =true;
					}
					if(map[i][j][k]=='E')
						end =(new pair(i,j,k,0));
					}
				}
				sc.nextLine();
			}
//			for(int i=0; i<l; i++) {
//				for(int j=0; j<r; j++) {
//					for(int k=0; k<c; k++) {
//							System.out.print(map[i][j][k]);
//					}
//					System.out.println();
//				}
//				System.out.println();
//			}
			int result = bfs();
			if(result == -1)
			System.out.println("Trapped!"+" ");
			else
				System.out.printf("Escaped in %d minute(s).\n", result);
		}
	}
public static int bfs() {
	 Queue<pair> q = new LinkedList<>();
     visit[a.z][a.x][a.y] = true;
     q.offer(new pair(a.z, a.x, a.y, 0));
	while(!q.isEmpty()) {
		pair p = q.poll();
		if(p.z == end.z && p.x == end.x && p.y== end.y) {
			return p.cnt;
		}
		for(int i =0; i<6; i++) {
			int nz = dz[i]+p.z;
			int nx = dx[i]+p.x;
			int ny=dy[i]+p.y;
//			System.out.println(nz+" "+nx+" "+ny);
			if(nz >= 0 && nz < l && nx >= 0  && nx<r &&ny>=0 && ny <c && !visit[nz][nx][ny] && map[nz][nx][ny]!='#') {
				visit[nz][nx][ny]= true;
//				System.out.println(nz+" "+nx+" "+ny);
				q.add(new pair(nz,nx,ny,p.cnt+1));
			}
		}
	}
	return -1;
}
}
