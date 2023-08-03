import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long min=0;
		long mid =0;
		long max=0;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		max++;
			while (true) { 
				
	
				mid = (max + min) / 2;
				
	 
				long count = 0;
				
	 
				for (int i= 0; i < arr.length; i++) {
					count += (arr[i] / mid);
				}
			
				if(count < M) {
					max = mid;
				}
				else {
					min = mid + 1;
				}
				if(min>=max) {
					break;
	 
			}
			}
			System.out.println(min - 1);
		
	
		}
}	
	


