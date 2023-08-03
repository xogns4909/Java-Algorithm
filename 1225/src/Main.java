import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String a =sc.next();
		String b=sc.next();
		int sum = 0;
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<b.length(); j++) {
				sum += Integer.parseInt(a.charAt(i)+"")* Integer.parseInt(b.charAt(j)+"");
			}
		}
		System.out.print(sum);
	}

}
