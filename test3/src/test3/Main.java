package test3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()/100;
		switch (n){
		case 7:
			System.out.print("실버");
			break;
		case 8:
			System.out.print("골드");
			break;
		case 9:
			System.out.print("브압피");	
			break;
		case 10:
			System.out.print("프리미엄");	
			break;
		default:
			System.out.print("브론즈");
			break;
		}
	}

}
