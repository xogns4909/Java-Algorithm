	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	class pair{
		int x;
		int y;
		int[] flist;
		
		public pair(int x, int y, int[] flist) {
			this.x = x;
			this.y = y;
			this.flist = flist;
		}
	}
	public class Main {
		static int n;
		static int[][] map;
		static int[][] empty;
		static Map<Integer,pair> m;
		static int[] dx = {-1,1,0,0};
		static int[] dy= {0,0,-1,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result =0;
		n = sc.nextInt();
		map = new int[n][n];
		m = new HashMap<>();
		emptyseat();
		
		for(int i =0; i<n*n; i++) {
			int num = sc.nextInt();
			int f1 = sc.nextInt();
			int f2 = sc.nextInt();
			int f3 = sc.nextInt();
			int f4 = sc.nextInt();
		int[] fr = {f1,f2,f3,f4};
		seatmap(num, fr);	
	
		}
		for(int i=1; i<=n*n; i++) {
			pair student = m.get(i);
			int cnt = 0;
			for(int friend : student.flist) {
				if(Math.abs(m.get(friend).x -student.x) + Math.abs(m.get(friend).y - student.y) == 1) {
					cnt++;
				}
			}
			if(cnt==1) result+=1;
			else if(cnt==2) result+=10;
			else if(cnt==3) result+=100;
			else if(cnt==4) result+=1000;
		}
		System.out.print(result);
	}
	public static void seatmap(int num,int [] fr) {
		int[][] nearScore = new int[n][n];
		for(int friend : fr) {
			if(m.containsKey(friend)) {
				pair student = m.get(friend);
				int x = student.x;
				int y = student.y;
				
				for(int i=0; i<4; i++) {
					int nx = x+dx[i];
					int ny = y+dy[i];
					if(nx>=0 && nx <n && ny >=0 && ny < n && map[nx][ny] == 0) {
						nearScore[nx][ny]++;
					}
				}
			}
		}
		
		int emptyCntMax = -1;
		int nearScoreMax = -1;
		int choiceX = -1;
		int choiceY = -1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] != 0) continue;
				if(nearScoreMax < nearScore[i][j]) {
					choiceX = i;
					choiceY = j;
					nearScoreMax = nearScore[i][j];
					emptyCntMax = empty[i][j];
				} else if(nearScoreMax == nearScore[i][j] && emptyCntMax < empty[i][j]) {
					emptyCntMax = empty[i][j];
					choiceX = i;
					choiceY = j;
				}
			}
		}
		
		map[choiceX][choiceY] = num;
		m.put(num, new pair(choiceX,choiceY, fr));
		
		for(int i=0; i<4; i++) {
			int nx_ = choiceX+dx[i];
			int ny_ = choiceY+dy[i];
			if(nx_>=0 && nx_ <n && ny_ >=0 && ny_ < n && map[nx_][ny_] == 0) {
				empty[nx_][ny_]--;
			}
		}
		
	}
	
	
	public static void emptyseat() {
		empty = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int cnt = 4;
				if(i==0 || i==n-1) cnt--;
				if(j==0 || j==n-1) cnt--;
				empty[i][j] = cnt;
			}
		}
		}
	}
