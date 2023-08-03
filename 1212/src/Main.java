import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a =sc.next();
		StringBuilder b = new StringBuilder();
		for(int i =0; i<a.length(); i++) {
			String c = Integer.toBinaryString(a.charAt(i)-'0');
			if(a.length() == 2 && i !=0) a ="0"+a;
			else if(a.length()==1 && i != 0) a ="00"+a;
			b.append(a);
		}
		System.out.println(b);
	}

}
