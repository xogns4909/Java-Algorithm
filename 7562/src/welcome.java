import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Thanku hoon = new Thanku();
		hoon.height=sc.nextInt();
		hoon.width=sc.nextInt();
		hoon.depth =sc.nextInt();
		hoon.print();
		System.out.print("³¡");
	}

}
