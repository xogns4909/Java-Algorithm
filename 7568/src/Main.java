import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] array =new int[N][2];
		int cnt ;
		for(int i=0; i<N; i++) {
			array[i][0] =sc.nextInt();
			array[i][1] =sc.nextInt();
			
		}
		for(int j=0; j<N; j++) {
			cnt =1;
			for(int k = 0; k < N; k++) {
				if(k == j) continue;
				if (array[j][0] < array[k][0] && array[j][1] < array[k][1]) {
					cnt+=1;
				}
			}
 
			System.out.print(cnt + " ");
		}
 
	}
}
	
