import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class dir{
	int x;
	int y;
	int count;
	public dir (int x,int y,int count){
		this.x = x;
		this.y = y;
		this.count = count;
	}
}

public class Main {
	static int count =0;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static List<Integer> result = new ArrayList<>();
	static boolean[][] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[][] map = new int[m][n];
		visit = new boolean[m][n];
		for(int i = 0 ; i<k; i++) {
			int x1 =scanner.nextInt();
			int y1 =scanner.nextInt();
			int x2 =scanner.nextInt();
			int y2 =scanner.nextInt();
			System.out.println(x1+" "+x2+" "+y1+" "+y2);
			for(int j=y1; j<y2; j++) {
				for(int l=x1; l<x2; l++) {
					map[j][l] = 1;
					visit[j][l] = true;
				}
			}
		}
		
//		for(int a=0;  a<m; a++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(map[a][j]);
//			}
//			System.out.println("");
//		}
//		
		Queue<dir> q = new  LinkedList();
		for(int i = 0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] ==0) {
					q.add(new dir(i,j,0));
					visit[i][j] =true;
					count = 0;
					bfs(map,q);
				}
			}
		}
	Collections.sort(result);
	for(int i=0; i<result.size(); i++) {
		System.out.print(result.get(i)+" ");
	}
	}
	static void bfs(int[][] map,Queue<dir> q ){
		count = 1;
		while(!q.isEmpty()) {
			dir d = q.poll();
			map[d.x][d.y] = 1;
			for(int i=0; i<4; i++) {
				int x = d.x + dx[i];
				int y = d.y + dy[i];
				if(x >=0 && x < map.length && y >=0 && y<map[0].length && map[x][y] == 0 && visit[x][y] != true) {
					visit[x][y] = true;
					q.add(new dir(x,y,d.count));
					count++;
//					System.out.println(x+" "+y+" "+count);
				}
			}
		}
		result.add(count);
	}
}
