import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int count;
	pair(int x,int y,int count){
		this.x =x;
		this.y =y;
		this.count=count;
	}
}

public class Main {
		static int n;
		static int m;
		static int[][] map;
		static int[][][] map_2;
		static int k;
		static int[] dx= {0,0,1,-1};
		static int[] dy = {1,-1,0,0};
		static int result =Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		sc.nextLine();
		map = new int[n][m];
		map_2= new int[n][m][k+1];
		for(int i=0; i<n; i++) {
				String s = sc.nextLine();
				for(int j=0; j<m; j++) {
					map[i][j] =  s.charAt(j) - '0';
					
			}
		} 
 map_2[0][0][0] = 1;
 Queue<pair> q = new LinkedList<pair>();
		 q.offer(new pair(0, 0, 0));
		 while (!q.isEmpty()) {
			 pair p = q.remove();
			 int x = p.x;
			 int y = p.y;
			 int z = p.count;
			 for (int h=0; h<4; h++) {
				 	int nx = x+dx[h];
				 	int ny = y+dy[h];
				 	if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				 	if (map[nx][ny] == 0 && map_2[nx][ny][z] == 0) {
				 		map_2[nx][ny][z] = map_2[x][y][z] + 1;
				 		q.offer(new pair(nx, ny, z));
				 	}
				 	if (z+1<= k && map[nx][ny] == 1 && map_2[nx][ny][z+1] == 0) {
				 		map_2[nx][ny][z+1] = map_2[x][y][z] + 1;
				 		q.offer(new pair(nx, ny, z+1));
		 		}	
			 }
		 }
//		 if (map_2[n-1][m-1][0] != 0 && map_2[n-1][m-1][1] != 0) {
//		 System.out.println(Math.min(map_2[n-1][m-1][0], map_2[n-1][m-1][1]));
//		 } else if (map_2[n-1][m-1][0] != 0) {
//		 System.out.println(map_2[n-1][m-1][0]);
//		 } else if (map_2[n-1][m-1][1] != 0) {
//		 System.out.println(map_2[n-1][m-1][1]);
//		 } else {
//		 System.out.println(-1);
//		 }
		 for(int i=0;i<=k;i++){
	            if(map_2[n-1][m-1][i] != 0){
	                result = Math.min(result,map_2[n-1][m-1][i]);
	            }
	        }
		 if(result == Integer.MAX_VALUE)
			 System.out.print(-1);
		 else {
		 System.out.print(result);
		 }
		 }

}
