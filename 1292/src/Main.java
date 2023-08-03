import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] array = new int[1000];
		int cnt = 0;
		int sum =0;
		int ad = 1;
		for(int i=0; i<1000; i++) {
			array[i] = ad;
			cnt += 1;
			if(cnt == ad ) {
				ad += 1;
				cnt =0;
			}
		}
		for(int i=A-1; i<B; i++) {
			sum+= array[i];
		}
		System.out.print(sum);
	}

}
