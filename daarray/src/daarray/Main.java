package daarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}

}
