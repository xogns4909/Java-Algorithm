package test2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
