import java.util.Scanner;
	
	public class Main {
		static int arr[][];
		static boolean check[][];
		static int x,y;
		static int[] dx = {0,0,1,-1,1,-1,1,-1};
		static int[] dy= {1,-1,0,0,1,1,-1,-1};
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true){
			int cnt =0;
			y = sc.nextInt();
			x = sc.nextInt();
			if (x == 0 && y ==0) break;
			arr = new int[x][y];
			check = new boolean[x][y];
			for(int i=0; i<x; i++) {
				for(int j=0; j<y; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<x; i++) {
				for(int j=0; j<y; j++) {
					if(arr[i][j]==1 && check[i][j] == false) {
						cnt+=1;
						bfs(i,j);
					}
				}
			}
			System.out.println(cnt);
		}
	}
public static void bfs(int x_1,int y_1) {
	check[x_1][y_1] = true;
	
	for(int i=0; i<8; i++) {
		if(x_1+dy[i] >= 0 && x_1+dy[i]<x && y_1+dx[i]>=0 && y_1+dx[i]<y && arr[x_1+dy[i]][y_1+dx[i]] == 1 && check[x_1+dy[i]][y_1+dx[i]] ==false) {
			bfs(x_1+dy[i],y_1+dx[i]);
		}
	}
}

}
