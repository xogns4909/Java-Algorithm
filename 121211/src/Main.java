import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a =sc.next();
		StringBuilder b = new StringBuilder();
		for(int i =0; i<a.length(); i++) {
			String c = Integer.toBinaryString(a.charAt(i)-'0');
			if(c.length() == 2 && i !=0) c ="0"+c;
			else if(c.length()==1 && i != 0) c ="00"+c;
			b.append(c);
		}
		System.out.println(b);
	}

}
