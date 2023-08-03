import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class index{
	int x;
	int y;
	index (int x, int y){
		this.x = x;
		this.y = y;
	}
}


public class Main {
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static List<index> list = new ArrayList<>();
	static boolean[][] visit;
	static char[][] map;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		map = new char[12][6];
		
		for(int i = 0; i<12; i++) {
			String s = sc.nextLine();
			for(int j=0; j<6; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		down();
		int a =0;
		while(true) {
			a++;
			boolean check = false;
			for(int i = 0; i<12; i++) {
				for(int j=0; j<6; j++) {
					if(map[i][j] !=  '.') {
						visit = new boolean[12][6];
						list = new ArrayList<>();
						checkpuyo(map[i][j],i,j);
					if(list.size() >= 4 ) {
						check = true;
						for(int k=0; k<list.size(); k++) {
							index l = list.get(k);
							map[l.x][l.y] = '.';
						}
					}
				}
				}
			}
			if(check == false) break;
			down();
			count ++;
		}
		System.out.println(count);
	}
	
public static void down() {
	for(int i =0; i<6; i++) {
		for(int j = 11; j>0; j--) {
			if(map[j][i] == '.')
				for(int k = j-1; k>=0; k--) {
					if(map[k][i] != '.') {
						map[j][i] = map[k][i];
						map[k][i] = '.';
						break;
					}
				}
		}
	}
}
	
public static void checkpuyo(char color,int x,int y) {
	Queue<index> q = new LinkedList<>();
	q.add(new index(x,y));
	list.add(new index(x,y));
	visit[x][y] =true;
	while(!q.isEmpty()) {
		index n = q.poll();
		for(int i =0; i<4; i++) {
			int nx = n.x + dx[i];
			int ny = n.y + dy[i];
			if(nx >= 0 && nx <12 && ny >=0 && ny < 12 && !visit[nx][ny] && map[nx][ny] == color) {
//				System.out.println(nx+" "+ny+" "+color+" "+ visit[nx][ny]);
				q.add(new index(nx,ny));
				list.add(new index(nx,ny));
				visit[nx][ny] = true;
			}
		}
	}
		
}
}

