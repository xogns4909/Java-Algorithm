import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = b;
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0; i<a-1; i++) {
			sum += month[i];
		}
		if(sum % 7 ==1) {
			System.out.println("MON");
		}
		else if(sum % 7 ==2) {
			System.out.println("TUE");
		}
		else if(sum % 7 ==3) {
			System.out.println("WED");
		}
		else if(sum % 7 ==4) {
			System.out.println("THU");
		}
		else if(sum % 7 ==5) {
			System.out.println("FRI");
		}
		else if(sum % 7 ==6) {
			System.out.println("SAT");
		}
		else if(sum % 7 ==0) {
			System.out.println("SUN");
		}
	}

}
