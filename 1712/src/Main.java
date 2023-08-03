import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C = sc.nextInt();
		if (B>C) {
			System.out.println(-1);
		}
			else {	
		int i = 1;
		while(A+ (B * i)> C * i) {
			i++;
		}
		System.out.println(long(A + (B * i) == C *i) ? i+1:i);
		System.out.println(A+(B* i));
		System.out.println(C* i);
	}
}
}