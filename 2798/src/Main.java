import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int sum=0;
		int[] array =new int[N];
		for(int i=0; i<N; i++) {
			array[i] =sc.nextInt();
		}
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
				int	result = array[i] +array[j]+array[k];
				if(result == M) {
					sum=result;
					break;
				}
				else if(sum < result  && result < M) {
					sum =result;
				}
				}
			}
		}
		System.out.print(sum);
	}

}
