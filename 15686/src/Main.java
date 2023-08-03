import java.util.ArrayList;
import java.util.Scanner;

class point{
	int x;
	int y;
	public point(int x, int y) {
		this.x =x;
		this.y =y; 
	}
	
}

public class Main {
	static int n;
	static int m;
	static int map[][];
	static ArrayList<point> chicken,house;
	static int ans;
	static boolean[] visit;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		map = new int[n][n];
		chicken = new ArrayList<point>();
		house = new ArrayList<point>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) {
					house.add(new point(i,j));
				}
				else if(map[i][j]==2) {
					chicken.add(new point(i,j));
				}
			}	
		}
		ans = Integer.MAX_VALUE;
		visit = new boolean[chicken.size()];
		dfs(0,0);
		System.out.print(ans);
	}
public static void dfs(int start, int cnt) {
	if(cnt == m) {
		int total =0;
		for(int i=0; i<house.size(); i++) {
			int size = Integer.MAX_VALUE;
			for(int j=0; j<chicken.size(); j++) {
				if(visit[j]==true) {
				int di = Math.abs(house.get(i).x-chicken.get(j).x)+Math.abs(house.get(i).y-chicken.get(j).y);
				
			size = Math.min(size, di);
				}
			}
		total+=size;	
		
		}
		
		ans = Math.min(total, ans);
		return;
	}
	else {
	  for (int i = start; i < chicken.size(); i++) {
          visit[i] = true;
          dfs(i + 1, cnt + 1);
          visit[i] = false;
	  }
	  }
}

}
