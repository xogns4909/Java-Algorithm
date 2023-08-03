import java.util.Scanner;

public class Main {
	static int[][] arr;
	static int[] dice;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		arr = new int[n][m];
		dice = new int [7];
		int x=sc.nextInt(); 
		int y=sc.nextInt();
		int tr = sc.nextInt();
		for(int i =0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0; i<tr; i++) {
			int dir = sc.nextInt();
			int x1 = x + dx[dir-1];
			int y1 = y + dy[dir-1];
			System.out.println(x1+" "+y1);
			if(x1 >= 0 && x1<n && y1 >=0 && y1<m ) {
				solve(dir);
				if(arr[x1][y1]==0) {
					arr[x1][y1]=dice[6];
				
				}
				else {
					dice[6]=arr[x1][y1];
					arr[x1][y1]=0;
					
				}
				x = x1;
				y= y1;
				for(int j=1; j<7; j++) {
					System.out.print(dice[j]);
				}
				System.out.println();
				System.out.println(dice[1]);
			}
		}
	}
public static void solve(int d) {
	int[] tmp = dice.clone();
	if(d == 1) {
		dice[6] = tmp[3];
		dice[1] =tmp[4];
		dice[3] = tmp[1];
		dice[4] = tmp[6];
	}
	else if(d==2) {
		dice[6] =tmp[4];
		dice[3] =tmp[6];
		dice[1]=tmp[3];
		dice[4]=tmp[1];
		
	}
	else if(d==3) {
		dice[6]=tmp[2];
		dice[5]=tmp[6];
		dice[1]=tmp[5];
		dice[2]=tmp[1];
	}
	else if(d==4) {
		dice[6]=tmp[5];
		dice[5]=tmp[1];
		dice[1]=tmp[2];
		dice[2]=tmp[6];
	}
}
}
