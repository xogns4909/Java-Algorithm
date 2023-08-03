package array1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		ArrayList list =new ArrayList();
		for(int i=0; i<5; i++) {
		list.add(i,sc.nextLine());
		}
		String list1 =list.toString();
		
		for(int j=0; j<list1.length(); j++) {
			System.out.print(list1.charAt(j));
		}
	}

}
