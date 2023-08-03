import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
	int x;
	int y;
	pair(int x, int y) {
		this.x =x;
		this.y =y;
	}
}
public class Main {
	static int map [][];
	static int r,c;
	static Queue<pair> q;
	static boolean[][] visit;
	static int[] dx = {0,-1,-1,-1,0,1,1,1};
	static int[] dy= {-1,-1,0,1,1,1,0,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		r =sc.nextInt();
		c =sc.nextInt();
		map = new int[r][r];
		visit= new boolean[r][r];
		q = new LinkedList<pair>();
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				map[i][j] = sc.nextInt();
				}
			}
        q.add(new pair(r - 1, 0));
        q.add(new pair(r - 1, 1));
        q.add(new pair(r - 2, 0));
        q.add(new pair(r - 2, 1));

		for(int i=0; i<c; i++) {
			int a= sc .nextInt();
			int b= sc.nextInt();
		move(a-1,b);	
		remove();	
		magic();
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				sum +=map[i][j];
			}
		}
		System.out.print(sum);
	}
static void move(int d,int s) {
	for(pair q : q) {
		q.x = (r + q.x + dx[d] * (s % r)) % r;
		q.y =(r + q.y + dy[d] * (s % r)) % r;
		
		map[q.x][q.y]+=1;
	}
}
static void remove() {
	 while (!q.isEmpty()) {
         pair a = q.poll();

        
         visit[a.x][a.y] = true;

         
         int cnt = 0;

         for (int k = 1; k <= 7; k += 2) { 
             int diagonalX = a.x + dx[k];
             int diagonalY = a.y + dy[k];

           
             if (diagonalX < 0 || diagonalY < 0 || diagonalX >= r || diagonalY >= r) continue;

             if (map[diagonalX][diagonalY] > 0) {
                 cnt++;
                 
             }
            
        
         }
         map[a.x][a.y] += cnt;
}
	

}

public static void magic() {
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < r; j++) {
           
            if (!visit[i][j] && map[i][j] >= 2) {
               
                q.add(new pair(i, j));
                map[i][j] -= 2;
            }
        }
    }

   
    visit = new boolean[r][r];
}
}
