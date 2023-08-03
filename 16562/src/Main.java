import java.util.Scanner;

public class Main {
	static int n,m,k;
	static int[] money;
	static int[] visit;
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		money = new int[n+1];
		visit = new int[n+1];
		for(int j=1; j<=n; j++) {
			visit[j] = j; 
		}
		for(int i=1; i<=n; i++) {
			money[i] =sc.nextInt();
		}
		for(int i =0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a,b,money);
		}
		int sum =0;
		for(int i=1; i<=n; i++) {
			if(visit[i]==i) {
				sum+=money[i];
			}	
		}
		if(k-sum < 0) {
			System.out.print("Oh no");
			}
		else System.out.print(sum);
	}
static public void solve(int a,int b ,int[] money) {
	int fa = find(a);
	int fb = find(b);
	if(fa!=fb) {
	if(money[fa]>money[fb]) {
		visit[fa] =fb;
		}
	else visit[fb] =fa;
	}
  }
static public int find(int f) {
	if(visit[f]==f) {
		return f;
	}
	else {
		return visit[f] = find(visit[f]);
	}
}
}
