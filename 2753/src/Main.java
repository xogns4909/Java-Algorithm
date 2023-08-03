import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		if(i % 4 == 0 && i % 100 != 0 || i % 4 == 0 && i % 400 ==0) {
			System.out.print(1);
			
		}
		else
			System.out.print(0);
	}

}
