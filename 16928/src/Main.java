import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] next = new int[101];
		int[] tmp = new int[101];
		for(int i=1; i<=100; i++) {
			next[i] = i;
			tmp[i] = -1;
		}
		for(int i =0; i<n; i++) {
			int x =sc.nextInt();
			int y= sc.nextInt();
			next[x]=y;
		}
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			next[x]=y;
		}
		tmp[1]=0;
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		while(!q.isEmpty()) {
			int x =q.remove();
			for(int i=1; i<=6; i++) {
				int y =x+i;
				if(y>100) continue;
				y = next[y];
				if(tmp[y]==-1) {
					tmp[y]=tmp[x]+1;
					q.add(y);
				}
			}
		}
			System.out.print(tmp[100]);
		
	}

}
