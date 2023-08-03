import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	int time;
	pair(int x, int y, int time){
		this.x =x;
		this.y=y;
		this.time=time;
	}
}
public class Main {
	static int n;
	static int[][] map;
	static Queue<pair> shark;
	static ArrayList<pair> fish;
	static pair sh;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map =new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j]= sc.nextInt();
				if(map[i][j] != 9) {
				sh = new pair(i,j,0);	
					map[i][j]=0;
				}
					}
			}
	//½ÇÆÐ!!!!¸ô¶ó	
	}

}
