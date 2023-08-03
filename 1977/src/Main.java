import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c =(int)Math.sqrt(a);
		if(c*c != a) {
			c +=1;
		}
		int d =(int)Math.sqrt(b);
		int sum =0;
		if(d-c<=0) {
			System.out.println(-1);
			}
		else {
			for(int i=c; i<=d; i++) {
			 sum += i*i;	
			}
			System.out.println(sum);
			System.out.println(c*c);
		}
	}

}
