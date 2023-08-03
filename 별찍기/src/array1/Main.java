package array1;
import java.util.Scanner;

public class Main {
	public static int plus(int a, int b) {
		return a+b;
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
				int b =sc.nextInt();
		Main m = new Main();
		System.out.print(m.plus(a,b));
		
		//		int num =1;
//		int[] arr= new int[10];
//		for(int i=0; i<3; i++) {
//			num*=sc.nextInt();
//				}
//		while(true) {
//			int a = num%10;
//			arr[a] +=1;
//			num = num/10;
//			if(num==0) {
//				break;
//			}
//					
//		}
//		for(int i=0; i<10; i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
