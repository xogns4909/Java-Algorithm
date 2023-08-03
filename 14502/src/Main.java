import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int x;
	int y;
	pair(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class Main {
	static int map[][]= new int[8][8];
	static int map_2[][]= new int[8][8];
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	static int n;
	static int m;
	
	
	public static int Bfs() {
		Queue<pair> q = new LinkedList<pair>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map_2[i][j]=map[i][j];
				if(map_2[i][j]==2) {
					q.add(new pair(j,i));
					 
				}
			}
		}
	while(!q.isEmpty()) {
		pair p = q.poll();
		int x = p.x;
		int y = p.y;
		for(int i=0; i<4; i++) {
			if(x+dx[i]>=0 && x+dx[i] < m && y+dy[i] >=0 && y+dy[i] < n ){
				if(map_2[y+dy[i]][x+dx[i]]==0) {
				map_2[y+dy[i]][x+dx[i]]=2;
				q.add(new pair(x+dx[i],y+dy[i]));
				}
			}
		}
	}
	int count =0;
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			if(map_2[i][j]==0) {
				count +=1;
			}
		}
	}
	return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int result =0;
		int x1=0,x2=0,x3=0;
		int y1=0,y2=0,y3=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				map[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]!=0) continue;
					x1 =i;
					y1=j;
					for(int k=0; k<n; k++) {
						for(int h=0; h<m; h++) {
							if(map[k][h]!=0) continue;
								x2 =k;
								y2=h;
								for(int l=0; l<n; l++) {
									for(int x=0; x<m; x++) {
										if(map[l][x]!=0) continue;
											x3 = l;
											y3 = x;
											if(x1 == x2 && y1==y2)continue;
											if(x2== x3 && y2==y3) continue;
											if(x1 ==x3 && y1==y3) continue;
											map[x1][y1]=1;
											map[x2][y2]=1;
											map[x3][y3]=1;
											result =Math.max(result, Bfs());
											map[x1][y1]=0;
											map[x2][y2]=0;
											map[x3][y3]=0;
							}
						}
					}
				}
			}
		}
		System.out.print(result); 
	}
	}
	