import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		int time = 0;
		int start = m;
		if(m+t > M) {
			System.out.print(-1);
		}
		else {
		while(n != 0) {
			if(start+t <= M) {
				time+=1;
				start += t;
				n -=1;
			}
			else if(start - r <m){
				start = m;
				time+=1;	
			}
			else {
				start -= r;
				time+=1;
			}
		}
		System.out.print(time);
	}
	}

}
