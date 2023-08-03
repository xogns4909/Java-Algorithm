import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int cnt = 1;
		int r = 2;
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (r <= N) {
				r = r + (6 * cnt);	 
				cnt+=1;
			}
			System.out.print(cnt);
		}
	}
}