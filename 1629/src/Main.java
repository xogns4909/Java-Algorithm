import java.util.Scanner;
 
public class Main {
 
	public static long C;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		long A = in.nextLong();
		long B = in.nextLong();
		C = in.nextLong();
		
		System.out.println(pow(A, B));
	}
	
	
	public static long pow(long a, long b) {
		
		if(b == 1) {
			return a % C;
		}
		
	
		long temp = pow(a, b / 2);
		
	
		if(b % 2 == 1) {
			return (temp * temp % C) * a % C;
		}
		return temp * temp % C;
		
	}
	
}