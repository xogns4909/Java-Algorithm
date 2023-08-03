import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String a = sc.next();
			String b =sc.next();
			if(a.equals('0') && b.equals('0')) {
				break;
			}
			int count =0;
			if(a.length()>b.length()) {
				for(int i=0; i<a.length()-b.length(); i++) {
					b = '0' + b;
				}
			}
			else {
				for(int i=0; i<b.length()-a.length(); i++) {
					a = '0' +a;
				}
			}
			for(int i= a.length()-1; i>=0; i--) {
				int c = (a.charAt(i)-'0');
				int d = (b.charAt(i)-'0');
				if(c+d>=10) {
					count+=1;
					
				}
			}
			System.out.println(count);
		}
	}

}
