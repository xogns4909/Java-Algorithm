import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int box = sc.nextInt();
		int book = sc.nextInt();
		int box_sum =0;
		int book_sum=0;
		for(int i=0; i<box; i++) {
			int a =sc.nextInt();
			box_sum +=a;
		}
		for(int j=0; j<book; j++) {
			int b =sc.nextInt();
			book_sum +=b;
		}
		System.out.print(box_sum-book_sum);
	}

}
