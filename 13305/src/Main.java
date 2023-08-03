import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] size = new int[N-1];
		int[] price = new int[N];
		int cnt =0;
		for(int i =0; i<N-1; i++){
			size[i] =sc.nextInt();
		}
		for(int j=0; j<N; j++) {
			price[j] =sc.nextInt();
		}
		int min=price[0];
		int sum =0;
				for(int i = 0; i < N - 1; i++) {
			
				if(price[i] < min) {
				min = price[i];
			}
			
			sum += (min * size[i]);	// 총 비용 누적 합
		}
		
		System.out.println(sum);
		
	}
}