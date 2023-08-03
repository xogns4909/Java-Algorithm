import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		long[] b =new long[a];
		for(int j=0; j<b.length; j++)
			b[j] = sc.nextInt(); 
		int c =sc.nextInt();
		long sum =0;
		for(int i = 0; i<b.length; i++) {
			if(b[i] != 0) {
					if(b[i] % c == 0)
						sum += b[i] / c;
					else
						sum += b[i] /c +1;
		}
			}
	System.out.println((long)(c*sum));
	}
	
	}

