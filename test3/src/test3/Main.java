package test3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()/100;
		switch (n){
		case 7:
			System.out.print("�ǹ�");
			break;
		case 8:
			System.out.print("���");
			break;
		case 9:
			System.out.print("�����");	
			break;
		case 10:
			System.out.print("�����̾�");	
			break;
		default:
			System.out.print("�����");
			break;
		}
	}

}
