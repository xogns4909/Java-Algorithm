package kimjihoobabo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+" * "+j +" = "+i*j+" ");
			}
			System.out.println();
		}


	}
	}
