package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList b = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		for(int i=0; i<num; i++) {
			b.add(sc.nextInt());
		}
		for(int j=0;  j<b.size(); j++) {
			sum += (int)b.get(j);
		}
		System.out.print((float)sum/num);
		
//		b.add(10);
//		b.add("hello");
//		System.out.println(b.get(0));
//		System.out.print(b.get(1));
//		
//		int[] a= new int[10];
//		for(int i=0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//			
//		}
//		for(int j=0; j<10; j++)
//		System.out.println(a[j]);
	}

}
