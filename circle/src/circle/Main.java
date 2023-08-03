package circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("반지름 입력하시오:");
		float a =sc.nextInt();
		System.out.println(Math.round(a*3.14*2*100)/100.0);
		System.out.println(String.format("%.2f",a*3.14*2));
		System.out.printf("%10f",a*3.14*2);
	}
}
