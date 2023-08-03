package array2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][7];
		for(int i=0; i<a; i++) {
			for(int j=0; j<5; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int k=0; k<a; k++) {
			b[k][5] = b[k][1]+b[k][2]+b[k][3]+b[k][4]+b[k][0];
			b[k][6] = b[k][5] / 5;
		}
		for(int i=0; i<a; i++) {
			for(int j=0; j<7; j++) {
			System.out.printf("%4d ",b[i][j]);
			}
			System.out.println("");
		}
	}

}
