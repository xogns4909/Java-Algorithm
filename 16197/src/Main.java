import java.util.Scanner;

public class Main {
	static int n,m;
	static char[][] arr;
	static final int[] dx= {0,0,1,-1};
	static final int[] dy= {1,-1,0,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		m=sc.nextInt();
		arr = new char[n][m];
		int x1,x2,y1,y2;
		x1=y1=x2=y2=-1;
		for(int i=0; i<n; i++) {
			arr[i] =sc.next().toCharArray();
			for(int j=0; j<m; j++) {
				if(arr[i][j]=='o') {
					if(x1 == -1) {
						x1 = i;
						y1 = j;
					}
				else {
					x2 = i;
					y2 =j;
						
					}
					arr[i][j] ='.';
				}
			}
		}
		System.out.println(bur(0,x1,y1,x2,y2));
		
		}
public static int bur(int go,int x1,int y1,int x2,int y2) {
	if(go == 11) {
		return -1;
	}
	boolean coin1 = false;
	boolean coin2 = false;
	if(x1<0 || x1 >= n || y1 <0 || y1>=m) coin1=true;
	if(x2<0 || x2 >=n ||y2<0 || y2>=m) coin2 = true;
	if(coin1==true && coin2==true) return -1;
	if(coin1==true || coin2==true) return go;
	int result = -1;
	for(int i=0; i<4; i++) {
		int x_1 =x1+dx[i];
		int y_1 =y1+dy[i];
		int x_2=x2+dx[i];
		int y_2=y2+dy[i];
	if(x_1>=0 && x_1 <n && y_1 >=0 && y_1 < m && arr[x_1][y_1] == '#') {
		x_1 =x1;
		y_1=y1;
	}
	if(x_2>=0 && x_2 <n && y_2>=0 && y_2 < m && arr[x_2][y_2] == '#') {
		x_2 =x2;
		y_2=y2;
	}
	int temp = bur(go+1,x_1,y_1,x_2,y_2);
	if(temp==-1) continue;
	if(result == -1 || result > temp) {
			result = temp;
	}
	}
	return result;
}

}
