package array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array =new int[num];
		int choose = sc.nextInt();
		String[] str = new String[num];
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
			str[i] = sc.next();
		}
		System.out.print(str[choose]);
				}
	}


