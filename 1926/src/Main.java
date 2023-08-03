import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class index{
	int x;
	int y;
	public index(int x ,int y ) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static boolean[][] visit;
	static int[][] map;
	static int count;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static List<Integer> result = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		map =new int[r][c];
		visit = new boolean[r][c];
		for(int i =0; i<r; i++) {
			for(int j =0; j<c ; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for(int i =0; i<r; i++) {
			for(int j =0; j<c ; j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					bfs(i,j);
				}
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		System.out.println(result.get(result.size()-1));
		
	}
	public static void bfs(int r,int c) {
		Queue<index > q = new LinkedList<>();
		q.add(new index(r,c));
		visit[r][c] = true;
 		count = 1;
		while(!q.isEmpty()) {
			index d = q.poll();
			for(int i=0; i<4; i++) {
				int x = d.x +dx[i];
				int y = d.y +dy[i];
				if(x >= 0 && x < map.length && y >= 0 && y < map[0].length && !visit[x][y] && map[x][y] == 1) {
					count += 1;
					q.add(new index(x,y));
					visit[x][y]=true;
				}
			}
		}
		result.add(count);
	}
}
