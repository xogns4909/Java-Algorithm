import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class pair{
//	int x;
//	int count;
//	pair(int x,int count){
//		this.x =x;
//		this.count =count;
//	}
//}

public class Main {
	static int n,m;
	static int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		arr = new int[100001];
		if(n==m) {
			System.out.print(0);
			System.exit(0);
		}
		bfs();
	}
public static void bfs() {
	Queue<Integer> q = new LinkedList<Integer>();
	q.offer(n);
	while(!q.isEmpty()) {
		int p = q.remove();
		for(int i=0; i<3; i++) {
			int dx =0;
			if(i ==0) {
				 dx = p+1;
			}
			if(i==1) {
				dx = p-1;
			}
			if(i==2) {
				dx =p*2;
			}
			if(dx ==m) {
				System.out.print(arr[p]+1);
				return;
			}
			else if(dx>=0 && dx <=100000 && arr[dx]==0 ) {
				arr[dx] =arr[p]+1;
				q.offer(dx);
		}
		
	}
	}
}
}