import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String b;
		int a = sc.nextInt();
		b = sc.next();
		sc.close();
		System.out.println(a*(b.charAt(2)-'0'));
		System.out.println(a*(b.charAt(1)-'0'));
		System.out.println(a*(b.charAt(0)-'0'));
		System.out.println(a*Integer.parseInt(b));
		}
	}


