import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			double sum =1;
			double sum1 =1;
			double d =0;
			double w = sc.nextDouble();
			double e = sc.nextDouble();
			for(double j=e; j>e-w; j--) {
				sum = sum * j;
			
			}
			for(double k=w; k>0; k--) {
				sum1 *=k;
				
			}
			d=sum/sum1;
			BigDecimal bigDecimal = new BigDecimal(d);
			System.out.print(bigDecimal.toString());
		}
	}

}
