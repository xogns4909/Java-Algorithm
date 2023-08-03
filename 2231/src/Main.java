import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num =sc.next();
		int n = Integer.parseInt(num);
		for(int i=n-9*num.length(); i<=n; i++) {
			int sum =0;
			int a= i;
			while(a!=0) {
			sum += a % 10;
			a /= 10;
			}
			if(sum+i == n) {
				System.out.print(i);
				break;
			}
			else if(i==n) {
				System.out.print(0);	
			}
			
		
			
		}
	}

}
