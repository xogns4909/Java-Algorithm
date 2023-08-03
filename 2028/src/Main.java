import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			int b = a*a;
			
			String c= Integer.toString(b);
			String d =Integer.toString(a);
			if(d.equals(c.substring(c.length()-d.length())))	
			System.out.println("YES");
			
			else
				System.out.println("NO");
		}
		
	}

}
