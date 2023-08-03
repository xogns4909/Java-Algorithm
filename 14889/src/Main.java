import java.util.Scanner;

public class Main {
	public static int N;
	public static int result=Integer.MAX_VALUE;
	public static int[][] arr;
	public static int[] team1,team2;
	public static int[] peak;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		team1 = new int[N/2];
		team2= new int[N/2];
		peak = new int[N]; 
		arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		dfs(0,0);
		System.out.print(result);

	}
	public static void dfs(int a,int count) {
		if(count == N/2) {
			sum();
			return;
		}
		for(int i=a; i<N; i++) {
				peak[i] = 1;
				dfs(i+1,count+1);
				peak[i] =0;
				
		}
	}
public static void sum() {
	int team_1 = 0;
	int team_2 =0;
	for(int i=0; i<N; i++) {
		if(peak[i]==0) {
			team1[team_1++]=i;
		}
		else {
			team2[team_2++] =i;
		}
	}
	int sum_1=0;
	int sum_2=0;
	for(int i=0; i<N/2; i++) {
		for(int j=i+1; j<N/2; j++) {
			 sum_1 += arr[team1[i]][team1[j]] +arr[team1[j]][team1[i]];
			sum_2 += arr[team2[i]][team2[j]] +arr[team2[j]][team2[i]];
		}
	}
		if(result> Math.abs(sum_1-sum_2)) {
		result =Math.abs(sum_1-sum_2);
	}
	
	
}
}
