import java.util.Scanner;
import java.lang.Math;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			int a =in.nextInt();
			int b =in.nextInt();
			int c =in.nextInt();
			if (a == b && a == c && b == c)
				System.out.println(10000+a*1000);	
			else if(a == b || a ==c) 
				System.out.println(1000+a*100);
			else if(b == c)
				System.out.println(1000+b*100);
			else {
				System.out.println(Math.max(a,Math.max(c, b))*100);
					
			}
	}	

}
